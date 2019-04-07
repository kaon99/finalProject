package model.dao.daoimpl;

import com.mysql.jdbc.Connection;
import model.dao.ConnectionPoolHolder;
import model.dao.StudentDao;
import model.entity.Student;
import org.apache.tomcat.jdbc.pool.ConnectionPool;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public void create(Student entity) {
String INSERT = "INSET INTO user (user_name_ua, user_surname_ua, user_name_en, user_surname_en, user_email, user_password, user_role) VALUES (?,?,?,?,?,?,?)";


    }

    /*public boolean add(User user) throws DataBaseException {
        String INSERT = "INSERT INTO user (firstName, secondName, email, password, level) VALUES (?, ?, ?, ?, ?)";
        logger.info(String.format("Add user name = %s", user.getfName()));

        try (Connection connection = ConnectionPool.getInstance().getConnection();
             PreparedStatement statement = connection.prepareStatement(INSERT)) {
            statement.setString(1, user.getfName());
            statement.setString(2, user.getsName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.setInt(5, user.getAccessLevel());

            statement.execute();

            return true;
        } catch (SQLException e) {
            logger.error(String.format("Cannot add user name = %s", user.getfName()), e);
            throw new DataBaseException("Cannot add user", e);
        }
    }*/

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
