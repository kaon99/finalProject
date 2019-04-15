package controller.command.admins;

import controller.command.Command;
import controller.command.pagesCommand.SendNotificatioinCommandPage;
import controller.command.util.EmailSender;
import utils.AttributesResourseManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SendNotificationCommandButton implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String email = request.getParameter(AttributesResourseManager.getProperty("parameter.email"));
        EmailSender.send(email);

        return new SendNotificatioinCommandPage().execute(request, response);
    }
}
