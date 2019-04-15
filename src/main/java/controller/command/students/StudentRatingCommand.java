package controller.command.students;

import controller.command.Command;
import controller.command.pagesCommand.StudentRatingCommandPage;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentRatingCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        return new StudentRatingCommandPage().execute(request,response);
    }
}