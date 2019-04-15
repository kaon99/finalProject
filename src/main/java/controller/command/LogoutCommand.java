package controller.command;



import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)  {
        request.getSession().invalidate();
        return PageResourseManager.getProperty("redirect").concat("/login");
    }
}
