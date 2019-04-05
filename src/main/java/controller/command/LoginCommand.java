package controller.command;

import model.entity.Student;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession(false);
        String login = request.getParameter(AttributesResourseManager.getProperty("parameter.login"));
        String passwrod = request.getParameter(AttributesResourseManager.getProperty("parameter.password"));

        Student student = (Student) session.getAttribute(AttributesResourseManager.getProperty("parameter.user"));
          return PageResourseManager.getProperty("login");
    }
}
