package controller.command.admins;

import controller.command.Command;
import controller.command.filter.LocaleFilter;
import controller.command.pagesCommand.SendNotificatioinCommandPage;
import controller.command.util.EmailSender;
import org.apache.log4j.Logger;
import utils.AttributesResourseManager;
import utils.PageResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendNotificationCommandButton implements Command {
    private Logger logger = Logger.getLogger(SendNotificatioinCommandPage.class);
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
logger.info("execute");
        String email = request.getParameter(AttributesResourseManager.getProperty("parameter.email"));
        EmailSender.send(email);

        return PageResourseManager.getProperty("redirect.admin.notification");
    }
}
