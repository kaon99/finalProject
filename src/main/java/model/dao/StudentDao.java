package model.dao;

import model.entity.Student;
import org.apache.catalina.User;

import java.sql.SQLException;

public interface StudentDao extends GenericDao<Student> {
    Student getByLoginAndPass(String login, String password) ;
    void setSumMarks (Student student);
}
