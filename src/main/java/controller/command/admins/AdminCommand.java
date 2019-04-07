package controller.command.admins;

import controller.command.Command;
import utils.PageResourseManager;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminCommand implements Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return PageResourseManager.getProperty("admin");
    }
}