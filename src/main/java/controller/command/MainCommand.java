package controller.command;

import controller.command.util.CommandUtil;
import model.entity.Student;
import org.apache.log4j.Logger;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;
import java.util.Optional;

public class MainCommand implements Command {
    private static Logger logger = Logger.getLogger(MainCommand.class);

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {


        Student student = (Student) request.getSession().getAttribute(AttributesResourseManager.getProperty("parameter.user"));

       if (Objects.nonNull(student)) {
           return CommandUtil.getUserPageByRole(student.getRole());
      }
        logger.info("execute");
       return PageResourseManager.getProperty("login");

    }
}