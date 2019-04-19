package controller.command;



import org.apache.log4j.Logger;
import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutCommand implements Command {
    private static Logger logger = Logger.getLogger(LogoutCommand.class);

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)  {
        request.getSession().invalidate();
        return PageResourseManager.getProperty("redirect").concat("/login");
    }
}
