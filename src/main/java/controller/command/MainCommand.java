package controller.command;

import controller.command.Command;
import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainCommand implements Command  {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return PageResourseManager.getProperty("main");
    }
}
