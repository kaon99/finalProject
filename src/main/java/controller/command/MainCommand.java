package controller.command;

import controller.command.Command;
import controller.command.util.CommandUtil;
import model.entity.Student;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MainCommand implements Command  {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        Student student = (Student) request.getSession().getAttribute(AttributesResourseManager.getProperty("parameter.user"));
        return CommandUtil.getUserPageByRole(student.getRole());
    }
}
