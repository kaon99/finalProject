package controller.command.students;

import controller.command.Command;
import controller.command.pagesCommand.StudentRatingCommandPage;
import model.entity.Student;
import model.exception.WrongDataException;
import model.service.SpecialtyService;
import model.service.StudentService;
import model.service.impl.SpecialtyServiceImpl;
import model.service.impl.StudentServiceImpl;
import org.apache.log4j.Logger;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.InputMismatchException;
import java.util.Optional;

public class StudentRatingCommand implements Command {
    private Logger logger = Logger.getLogger(StudentRatingCommand.class);
    SpecialtyService specialtyService = new SpecialtyServiceImpl();
    StudentService studentService = new StudentServiceImpl();
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        Student student = (Student) request.getSession().getAttribute(AttributesResourseManager.getProperty("parameter.user"));
        studentService.setMarks(student);
        request.setAttribute("speciatlyList" ,specialtyService.findAll());
        try {
            Integer specialtyId = Integer.parseInt(request.getParameter(AttributesResourseManager.getProperty("parameter.specialty")));
            request.setAttribute("studentsReceivedList",studentService.receivedStudents(specialtyId));
        } catch (NumberFormatException e) {
            logger.debug("numberFormat", e);
            request.setAttribute("notFound", true);
            return new StudentRatingCommandPage().execute(request,response);
        }
        logger.info("execute");
        return new StudentRatingCommandPage().execute(request,response);
    }
}