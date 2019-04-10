package model.service;

import model.entity.Student;

import java.util.List;

public interface StudentService {
    void create (Student student);

    Student findById(int id);
    List<Student> findAll();
    void update(Student entity);
    void delete(int id);
    void setMarks (Student entity);
    Student loginUser (String login,String password);
}
