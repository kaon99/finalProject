package model.service.impl;

import model.dao.SubjectDao;
import model.dao.daoimpl.StudentDaoImpl;
import model.dao.daoimpl.SubjectDaoImpl;
import model.entity.Subject;
import model.service.SubjectService;
import org.apache.log4j.Logger;

import java.util.List;

public class SubjectServiceImpl implements SubjectService {
    private SubjectDao subjectDao;
    private static Logger logger = Logger.getLogger(SubjectServiceImpl.class);

    public SubjectServiceImpl() {
        subjectDao = new SubjectDaoImpl();
    }

    @Override
    public void create(Subject subject) {
        subjectDao.create(subject);
        logger.info("Create subject ");
    }

    @Override
    public Subject findById(int id) {
        Subject subject = subjectDao.findById(id);
        logger.info("Find subject by id ");
        return subject;
    }

    @Override
    public List<Subject> findAll() {
        List<Subject> subjects = subjectDao.findAll();
        return subjects;
    }

    @Override
    public void update(Subject entity) {
        subjectDao.update(entity);
        logger.info("Subject update");

    }

    @Override
    public void delete(int id) {
subjectDao.delete(id);
    }
}
