package controller.command.students;

import controller.command.Command;
import model.entity.Student;
import model.entity.types.Role;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentPageCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        Student student = (Student) request.getSession().getAttribute(AttributesResourseManager.getProperty("parameter.user"));
            request.setAttribute(AttributesResourseManager.getProperty("parameter.name.ua"),student.getNameUa());
            request.setAttribute(AttributesResourseManager.getProperty("parameter.surname.ua"),student.getSurnameUa());
            request.setAttribute(AttributesResourseManager.getProperty("parameter.name.en"),student.getNameEn());
            request.setAttribute(AttributesResourseManager.getProperty("parameter.surname.en"),student.getSurnameEn());
            request.setAttribute(AttributesResourseManager.getProperty("parameter.email"),student.getEmail());



            return PageResourseManager.getProperty("studentpage");
        }




       }

