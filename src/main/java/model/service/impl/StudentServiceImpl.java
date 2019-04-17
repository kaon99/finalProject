package model.service.impl;

import model.dao.StudentDao;
import model.dao.daoimpl.StudentDaoImpl;
import model.entity.Student;
import model.service.StudentService;
import org.apache.log4j.Logger;

import java.util.List;

public class StudentServiceImpl implements StudentService {
 private StudentDao studentDao ;
    private static Logger logger = Logger.getLogger(StudentDaoImpl.class);
public StudentServiceImpl(){

    studentDao =  new StudentDaoImpl();
    }

    @Override
    public void create(Student student) {
        studentDao.create(student);
logger.info("Create user = %d");
    }

    @Override
    public Student findById(int id) {
       Student student = studentDao.findById(id);
       logger.info("Find student by id ");
       return student;
    }

    @Override
    public List<Student> findAll() {
    List <Student > students = studentDao.findAll();
    logger.info("Find all students ");

    return students;
    }

    @Override
    public void update(Student entity) {
    logger.info("User update %d");
    studentDao.update(entity);

    }

    @Override
    public void delete(int id) {
    logger.info("delece user");
studentDao.delete(id);
    }

    @Override
    public void setMarks(Student student) {
    logger.info("set marks");
studentDao.setSumMarks(student);
    }

    @Override
    public Student findByEmail(String email) {
        logger.info("find email");
        Student student = studentDao.findByEmail(email);
        return student;
    }

    @Override
    public Student loginUser(String login, String password) {
    logger.info("get Login and password");
    Student student = studentDao.getByLoginAndPass(login,password);

    return student;
    }

    @Override
    public void setSpecialty(Integer specialtyId, Student student) {
        logger.info("set specialty to user");
        studentDao.setSpecialty(specialtyId,student);
    }

    @Override
    public List<Student> receivedStudents(Integer specialtyId) {
        logger.info("received students list");
        return studentDao.findReceivedStudents(specialtyId);
    }



}
