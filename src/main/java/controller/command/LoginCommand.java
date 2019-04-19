package controller.command;

import controller.command.util.CommandUtil;

import model.entity.Student;
import model.service.StudentService;
import model.service.impl.StudentServiceImpl;
import org.apache.log4j.Logger;
import utils.AttributesResourseManager;
import utils.ContextUtil;
import utils.ContextUtil.*;
import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

public class LoginCommand implements Command {
    private static Logger logger = Logger.getLogger(LoginCommand.class);


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        request.getSession().invalidate();
        String login = request.getParameter(AttributesResourseManager.getProperty("parameter.login"));
        String password = request.getParameter(AttributesResourseManager.getProperty("parameter.password"));

        if (Objects.nonNull(login) && Objects.nonNull(password)) {
            StudentService studentService = new StudentServiceImpl();

            Student student = studentService.loginUser(login, password);
            if(ContextUtil.isUserInContext(request.getSession(),student)){
                ContextUtil.logoutUser(student);
            }
            request.getSession().setAttribute("user", student);
            ContextUtil.setAttributesToContext(request.getSession(),student);
            logger.info("user created");

            if (Objects.nonNull(student)) {
                String page = CommandUtil.getUserPageByRole(student.getRole());
                return page;
            }
            else  {
                request.setAttribute("notFound", true);
            }
        }

        return PageResourseManager.getProperty("login");
    }
}
