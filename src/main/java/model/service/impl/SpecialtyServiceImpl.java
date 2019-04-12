package model.service.impl;

import model.dao.SpecialtyDao;
import model.dao.daoimpl.SpecialtyDaoImpl;
import model.entity.Specialty;
import model.service.SpecialtyService;
import org.apache.log4j.Logger;

import java.util.List;

public class SpecialtyServiceImpl implements SpecialtyService {
    private SpecialtyDao specialtyDao;
    private static Logger logger = Logger.getLogger(SpecialtyServiceImpl.class);

    public SpecialtyServiceImpl() {

        specialtyDao = new SpecialtyDaoImpl();
    }

    @Override
    public void create(Specialty specialty) {
        specialtyDao.create(specialty);
        logger.info("Create specialty = %d");
    }

    @Override
    public Specialty findById(int id) {
        Specialty specialty = specialtyDao.findById(id);
        logger.info("Find specialty by id ");
        return specialty;
    }

    @Override
    public List<Specialty> findAll() {
        List <Specialty > specialties = specialtyDao.findAll();
        logger.info("Find all specialty ");
        return specialties;
    }

    @Override
    public void update(Specialty entity) {
        logger.info("Specialty update %d");
        specialtyDao.update(entity);

    }

    @Override
    public void delete(int id) {
        logger.info("delete specialty");
        specialtyDao.delete(id);

    }
}
