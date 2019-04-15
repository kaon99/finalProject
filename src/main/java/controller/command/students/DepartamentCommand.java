package controller.command.students;

import controller.command.Command;
import controller.command.pagesCommand.DepartamentCommandPage;
import model.entity.Student;
import model.service.SpecialtyService;
import model.service.StudentService;
import model.service.impl.RatingServiceImpl;
import model.service.impl.SpecialtyServiceImpl;
import model.service.impl.StudentServiceImpl;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DepartamentCommand implements Command {
    SpecialtyService specialtyService  = new SpecialtyServiceImpl();
    StudentService studentService = new StudentServiceImpl();


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        final HttpSession session = request.getSession();

        request.setAttribute("speciatlyList" ,specialtyService.findAll());
        Integer specialtyId = Integer.parseInt(request.getParameter(AttributesResourseManager.getProperty("parameter.specialty")));
        Student student = (Student) session.getAttribute(AttributesResourseManager.getProperty("parameter.user"));

        studentService.setSpecialty(specialtyId,student);
        return new DepartamentCommandPage().execute(request,response);
    }
}
