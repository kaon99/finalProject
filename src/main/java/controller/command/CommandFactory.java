package controller.command;

import controller.command.admins.AdminCommand;
import controller.command.admins.SendNotificatioinCommand;
import controller.command.admins.SetMarksCommand;
import controller.command.students.DepartamentCommand;
import controller.command.students.StudentPageCommand;
import controller.command.students.StudentRatingCommand;
import utils.PageResourseManager;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {


    static private Map<String, Command> commandMap = new HashMap<>();


    static {
        commandMap.put("admin", new AdminCommand());
        commandMap.put("login", new LoginCommand());
        commandMap.put("departament", new DepartamentCommand());
        commandMap.put("registration", new RegistrationCommand());
        commandMap.put("sendnotification", new SendNotificatioinCommand());
        commandMap.put("setmarks", new SetMarksCommand());
        commandMap.put("studentpage", new StudentPageCommand());
        commandMap.put("studentrating", new StudentRatingCommand());
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





