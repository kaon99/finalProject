package model.service;

import model.entity.Student;

public interface StudentService {
    Student loginUser (String login,String password);
}
