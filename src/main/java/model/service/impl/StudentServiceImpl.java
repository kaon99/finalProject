package model.service.impl;

import model.dao.StudentDao;
import model.dao.daoimpl.StudentDaoImpl;
import model.entity.Student;
import model.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
 private StudentDao studentDao ;

public StudentServiceImpl(){

    studentDao =  new StudentDaoImpl();
    }

    @Override
    public void create(Student student) {
        studentDao.create(student);
    }

    @Override
    public Student findById(int id) {
       Student student = studentDao.findById(id);
       return student;
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
    public Student loginUser(String login, String password) {
    Student student = studentDao.getByLoginAndPass(login,password);

    return student;
    }
}
