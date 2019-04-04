package controller;

import controller.command.Command;
import controller.command.CommandFactory;
import model.exception.NotFoundOperationException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Servlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       processRequest(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

            processRequest(req,resp);

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String path = request.getRequestURI();
        System.out.println(path);
        path = path.replaceAll(".*/" , "");
        System.out.println(path);
        Command command = CommandFactory.getCommand(path);
        String page = command.execute(request,response);
        if (page.contains("redirect")) {
            response.sendRedirect(page.replace("redirect:", "/api"));
        }else {
            request.getRequestDispatcher(page).forward(request, response);
        }
    }

}