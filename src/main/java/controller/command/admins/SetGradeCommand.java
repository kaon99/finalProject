package controller.command.admins;

import controller.command.Command;
import model.service.RatingService;
import model.service.StudentService;
import model.service.impl.RatingServiceImpl;
import model.service.impl.StudentServiceImpl;
import utils.PageResourseManager;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetGradeCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        StudentService studentService = new StudentServiceImpl();
        RatingService ratingService = new RatingServiceImpl();
        return PageResourseManager.getProperty("admin/setgrade");
    }
}