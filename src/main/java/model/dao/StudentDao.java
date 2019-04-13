package model.dao;

import model.entity.Student;


public interface StudentDao extends GenericDao<Student> {
    Student getByLoginAndPass(String login, String password) ;
    void setSumMarks(Student student);
    Student findByEmail (String email);
}
