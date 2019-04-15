package controller.command.students;

import controller.command.Command;
import controller.command.pagesCommand.StudentRatingCommandPage;
import model.service.SpecialtyService;
import model.service.StudentService;
import model.service.impl.SpecialtyServiceImpl;
import model.service.impl.StudentServiceImpl;
import utils.AttributesResourseManager;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentRatingCommand implements Command {
    SpecialtyService specialtyService = new SpecialtyServiceImpl();
    StudentService studentService = new StudentServiceImpl();
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {



        request.setAttribute("speciatlyList" ,specialtyService.findAll());
        Integer specialtyId = Integer.parseInt(request.getParameter(AttributesResourseManager.getProperty("parameter.specialty")));
        request.setAttribute("studentsReceivedList",studentService.receivedStudents(specialtyId));
        return new StudentRatingCommandPage().execute(request,response);
    }
}