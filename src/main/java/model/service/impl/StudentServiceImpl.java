package model.service.impl;

import model.dao.DaoFactory;
import model.dao.StudentDao;
import model.dao.mapper.StudentMapper;
import model.entity.Student;
import model.service.StudentService;

public class StudentServiceImpl implements StudentService {
 private StudentDao studentDao ;

public StudentServiceImpl(){
    studentDao = StudentService.factory.createStudentDao();
    }
    @Override
    public Student loginUser(String login, String password) {
    Student student = studentDao.getByLoginAndPass(login,password);
    return student;
    }
}
