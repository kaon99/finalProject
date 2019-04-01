package controller;

import controller.command.Command;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.HashMap;
import java.util.Map;

public class Servlet  extends HttpServlet {

    private Map<String, Command> commands = new HashMap< >();


    @Override
    public void init(ServletConfig config) throws ServletException {
       // config.getServletContext().setAttribute();
    }
}
