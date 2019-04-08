package controller.command.students;

import controller.command.Command;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentPageCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {


        return "/WEB-INF/view/studentpage.jsp";
    }
}