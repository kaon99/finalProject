package model.service;

import model.dao.DaoFactory;
import model.entity.Student;

public interface StudentService {
    DaoFactory factory = DaoFactory.getInstance();
    Student loginUser (String login,String password);
}
