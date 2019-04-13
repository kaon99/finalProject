package controller.command;

import controller.command.admins.AdminCommand;
import controller.command.admins.SendNotificatioinCommand;
import controller.command.admins.SetGradeCommand;
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
        commandMap.put("studentpage/departament", new DepartamentCommand());
        commandMap.put("registration", new RegistrationCommand());
        commandMap.put("admin/sendnotification", new SendNotificatioinCommand());
        commandMap.put("admin/setgrade", new SetGradeCommand());
        commandMap.put("studentpage", new StudentPageCommand());
        commandMap.put("studentpage/studentrating", new StudentRatingCommand());
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





