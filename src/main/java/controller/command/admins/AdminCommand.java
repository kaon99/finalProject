package controller.command.admins;

import controller.command.Command;
import model.entity.Student;
import model.entity.types.Role;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        Student student = (Student) request.getSession().getAttribute(AttributesResourseManager.getProperty("parameter.user"));
        if (student.getRole() == Role.ADMIN.getRole())
        return PageResourseManager.getProperty("admin");
        else {
            return PageResourseManager.getProperty("main");
        }
    }
}