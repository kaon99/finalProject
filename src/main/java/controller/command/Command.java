package controller.command;

import javax.servlet.http.HttpServlet;

public interface Command {
    String execute (HttpServlet request);
}
