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
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        try {
            processRequest(req,resp);
        } catch (NotFoundOperationException e) {
            e.printStackTrace();
        }

    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NotFoundOperationException {
        String path = request.getRequestURI();
        path = path.replaceAll(".*/view/", "");
        Command command = CommandFactory.getCommand(path);
        System.out.println(command.getClass().getName());
        String page = command.execute(request, response);
        request.getRequestDispatcher(page).forward(request, response);
    }

}