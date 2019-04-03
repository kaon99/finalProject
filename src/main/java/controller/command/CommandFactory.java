package controller.command;

import controller.command.admins.AdminCommand;
import controller.command.admins.SendNotificatioinCommand;
import controller.command.admins.SetMarksCommand;
import controller.command.students.DepartamentCommand;
import controller.command.students.StudentPageCommand;
import controller.command.students.StudentRatingCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private static CommandFactory instance() {
        return new CommandFactory();
    }

    public static CommandFactory getInstance() {
        return instance();
    }

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
        commandMap.put("main",new MainCommand());
    }

    public static Command getCommand(String url){
        Command command = commandMap.get(url);



        return command;
    }

}





