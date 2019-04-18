package model.dao.daoimpl;


import model.dao.StudentDao;
import model.dao.connectionpool.ConnectionPool;
import model.dao.mapper.StudentMapper;
import model.entity.Student;
import org.apache.log4j.Logger;
import utils.QueriesResourseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class StudentDaoImpl implements StudentDao {
    private Logger logger = Logger.getLogger(StudentDaoImpl.class);
    private Connection connection;

    public StudentDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Student student) {

        try (PreparedStatement statement = connection.prepareStatement(QueriesResourseManager.getProperty("insert.user"))) {

            statement.setString(1, student.getNameUa());
            statement.setString(2, student.getSurnameUa());
            statement.setString(3, student.getNameEn());
            statement.setString(4, student.getSurnameEn());
            statement.setString(5, student.getEmail());
            statement.setString(6, student.getPassword());
            statement.setInt(7, student.getRole());
            statement.execute();
            close();
        } catch (SQLException e) {
            logger.error("Student don`t create ", e);
        }
    }

    @Override
    public Student getByLoginAndPass(String login, String password) {

        try (PreparedStatement statement = connection.prepareStatement
                (QueriesResourseManager.getProperty("select.by.login.password"));) {


            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            Student student = null;
            if (resultSet.next()) {
                StudentMapper studentMapper = new StudentMapper();
                student = studentMapper.extractFromResultSet(resultSet);
            }

            close();
            return student;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Cannot get user", e);
        }


    }

    @Override
    public void setSumMarks(Student student) {

        try (PreparedStatement statement = connection.prepareStatement(QueriesResourseManager.getProperty("user.find.sum"));) {

            connection.setAutoCommit(false);

            statement.setInt(1, student.getSpecialty_id());
            statement.setInt(2, student.getId());
            ResultSet resultSet = statement.executeQuery();
            Integer sumOfResult = null;
            if (resultSet.next()) {
                sumOfResult = resultSet.getInt("grade");

            }
            if (Objects.isNull(sumOfResult)) {
                connection.rollback();
                sumOfResult = 0;
            }
            try (PreparedStatement setGradeStatement = connection.prepareStatement(QueriesResourseManager.getProperty("user.set.sum"))) {

                setGradeStatement.setInt(1, sumOfResult);
                setGradeStatement.setInt(2, student.getId());
                setGradeStatement.execute();
                connection.commit();
                connection.setAutoCommit(true);
                close();
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    @Override
    public Student findByEmail(String email) {
        try (PreparedStatement statement = connection.prepareStatement
                (QueriesResourseManager.getProperty("user.select.by.email"));) {


            statement.setString(1, email);
            ResultSet resultSet = statement.executeQuery();
            Student student = null;
            if (resultSet.next()) {
                StudentMapper studentMapper = new StudentMapper();
                student = studentMapper.extractFromResultSet(resultSet);
                close();
            }


            return student;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Cannot get user", e);
        }
    }

    @Override
    public void setSpecialty(Integer specialtyId, Student student) {
        try (PreparedStatement statement = connection.prepareStatement(QueriesResourseManager.getProperty("user.set.specialty"));
        ) {

            statement.setInt(1, specialtyId);
            statement.setInt(2, student.getId());
            statement.execute();
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> findReceivedStudents(Integer specialtyId) {
        try (PreparedStatement statement = connection.prepareStatement(QueriesResourseManager.getProperty("user.find.received"));) {


            statement.setInt(1, specialtyId);
            ResultSet resultSet = statement.executeQuery();
            List<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                students.add(new StudentMapper().extractFromResultSet(resultSet));


            }
            close();
            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public Student findById(int id) {
        try (PreparedStatement statement = connection.prepareStatement(QueriesResourseManager.getProperty("user.find.by.id"));) {

            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Student student = null;
            if (resultSet.next()) {
                StudentMapper studentMapper = new StudentMapper();
                student = studentMapper.extractFromResultSet(resultSet);
            }
            close();
            return student;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        try (PreparedStatement statement = connection.prepareStatement(QueriesResourseManager.getProperty("user.find.all"));) {


            ResultSet resultSet = statement.executeQuery();
            List<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                students.add(new StudentMapper().extractFromResultSet(resultSet));


            }
            close();
            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(Student student) {
        try (PreparedStatement statement = connection.prepareStatement(QueriesResourseManager.getProperty("user.update"));
        ) {
            statement.setString(1, student.getNameUa());
            statement.setString(2, student.getSurnameUa());
            statement.setString(3, student.getNameEn());
            statement.setString(4, student.getSurnameEn());
            statement.setString(5, student.getEmail());
            statement.setString(6, student.getPassword());
            statement.setInt(7, student.getRole());
            // statement.setInt(8,student.getSpecialty_id());
            statement.setInt(8, student.getSumOfaccessment());
            statement.setInt(9, student.getId());
            statement.execute();
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        try (PreparedStatement statement = connection.prepareStatement(QueriesResourseManager.getProperty("user.delete"))) {
            statement.setInt(1, id);
            statement.executeUpdate();
            close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {

        }
    }
}


