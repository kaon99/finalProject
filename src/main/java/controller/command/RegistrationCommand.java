package controller.command;

import controller.command.pagesCommand.RegistrationCommandPage;
import controller.command.util.CommandUtil;
import model.entity.Student;
import model.entity.types.Role;
import model.exception.WrongDataException;
import model.service.StudentService;
import model.service.impl.StudentServiceImpl;
import utils.AttributesResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

public class RegistrationCommand implements Command {


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        StudentService studentService = new StudentServiceImpl();
        try {
            String email = request.getParameter(AttributesResourseManager.getProperty("parameter.email"));
            String password = request.getParameter(AttributesResourseManager.getProperty("parameter.password"));
            if (Objects.isNull(email) && Objects.isNull(password)) {
                throw new WrongDataException();
            }
            String nameUa = request.getParameter(AttributesResourseManager.getProperty("parameter.name.ua"));
            String surnameUa = request.getParameter(AttributesResourseManager.getProperty("parameter.surname.ua"));
            String nameEn = request.getParameter(AttributesResourseManager.getProperty("parameter.name.en"));
            String surnameEn = request.getParameter(AttributesResourseManager.getProperty("parameter.surname.en"));
            Integer role = Role.ABITURIENT.getRole();
            Student student = new Student(nameUa,surnameUa,nameEn,surnameEn,email,password,role);
            studentService.create(student);
            request.getSession().setAttribute(AttributesResourseManager.getProperty("parameter.user"),student);
            CommandUtil.getUserPageByRole(student.getRole());
        } catch (WrongDataException e) {
            e.printStackTrace();
        }
        return new RegistrationCommandPage().execute(request,response);
    }
}