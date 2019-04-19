package controller.command.listener;

import model.entity.Student;
import utils.AttributesResourseManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.logging.Logger;

public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().addListener(new SessionListener());
        servletContextEvent.getServletContext().setAttribute(
                AttributesResourseManager.getProperty("attribute.servlet.context.logged.users"),
                new HashMap<Student, HttpSession>());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
