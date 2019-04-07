package model.dao.daoimpl;


import model.dao.StudentDao;
import model.dao.connectionpool.ConnectionPool;
import model.dao.mapper.StudentMapper;
import model.entity.Student;
import utils.QueriesResourseManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void create(Student entity) {


    }

    @Override
    public Student getByLoginAndPass(String login, String password) {

        try (Connection connection = ConnectionPool.getInstance().getConnection()) {
            PreparedStatement statement = connection.prepareStatement
                    (QueriesResourseManager.getProperty("select.by.login.password"));
            statement.setString(1, login);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            Student student = null;
            if (resultSet.next()) {
                StudentMapper studentMapper = new StudentMapper();
                student = studentMapper.extractFromResultSet(resultSet);
            }


            return student;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Cannot get user", e);
        }


    }


    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void update(Student entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() {

    }
}


