package controller.command.pagesCommand;

import controller.command.Command;
import utils.PageResourseManager;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentRatingCommandPage implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {




        return PageResourseManager.getProperty("studentpage/studentrating");
    }
}