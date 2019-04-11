package controller.command;

import controller.command.util.CommandUtil;
import model.entity.Student;
import utils.AttributesResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainCommand implements Command  {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        Student student = (Student) request.getSession().getAttribute(AttributesResourseManager.getProperty("parameter.user"));
        return CommandUtil.getUserPageByRole(student.getRole());
    }
}
