package model.service.impl;

import model.dao.RatingDao;
import model.dao.daoimpl.RatingDaoImpl;
import model.entity.Rating;
import model.service.RatingService;
import org.apache.log4j.Logger;

import java.util.List;

public class RatingServiceImpl implements RatingService {
    private RatingDao ratingDao;
    private static Logger logger = Logger.getLogger(RatingServiceImpl.class);
    public RatingServiceImpl(){

        ratingDao =  new RatingDaoImpl();
    }

    @Override
    public void create(Rating rating) {
        ratingDao.create(rating);
        logger.info("Rating user = %d");
    }

    @Override
    public Rating findById(int id) {
        Rating rating = ratingDao.findById(id);
        logger.info("Find rating by id ");
        return rating;
    }

    @Override
    public List<Rating> findAll() {
        List <Rating > ratings = ratingDao.findAll();
        logger.info("Find all ratings ");

        return ratings;
    }

    @Override
    public void update(Rating entity) {
        logger.info("Rating update %d");
        ratingDao.update(entity);
    }

    @Override
    public void delete(int id) {
        logger.info("delece rating");
        ratingDao.delete(id);
    }
}
