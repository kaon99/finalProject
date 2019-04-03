package controller.command.students;

import controller.command.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainCommand implements Command  {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "redirect:/WEB-INF/view/main.jsp";
    }
}
