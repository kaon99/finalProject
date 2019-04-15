package controller.command;

import controller.command.admins.AdminCommand;
import controller.command.admins.SendNotificationCommandButton;
import controller.command.pagesCommand.SendNotificatioinCommandPage;
import controller.command.admins.SetGradeCommand;
import controller.command.pagesCommand.DepartamentCommandPage;
import controller.command.pagesCommand.RegistrationCommandPage;
import controller.command.pagesCommand.SetGradeCommandPage;
import controller.command.pagesCommand.StudentRatingCommandPage;
import controller.command.students.DepartamentCommand;
import controller.command.students.StudentPageCommand;
import controller.command.students.StudentRatingCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {


    static private Map<String, Command> commandMap = new HashMap<>();


    static {
        commandMap.put("admin", new AdminCommand());
        commandMap.put("login", new LoginCommand());
        commandMap.put("studentpage/departament", new DepartamentCommandPage());
        commandMap.put("studentpage/departament/set", new DepartamentCommand());
        commandMap.put("registration", new RegistrationCommandPage());
        commandMap.put("registration/create", new RegistrationCommand());
        commandMap.put("admin/sendnotification", new SendNotificatioinCommandPage());
        commandMap.put("admin/sendnotification/send", new SendNotificationCommandButton());
        commandMap.put("admin/setgrade", new SetGradeCommandPage());
        commandMap.put("admin/setgrade/button",new SetGradeCommand());
        commandMap.put("studentpage", new StudentPageCommand());
        commandMap.put("studentpage/studentrating", new StudentRatingCommandPage());
        commandMap.put("studentpage/studentrating/show", new StudentRatingCommand());
        commandMap.put("main", new MainCommand());
        commandMap.put("logout", new LogoutCommand());


    }

    public static Command getCommand(String url) {
        Command command = commandMap.get(url);


if (command == null){
    return new PageErrorCommand() ;
}
        return command;
    }

}





