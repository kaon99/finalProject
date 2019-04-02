package controller.command;

import model.exception.NotFoundOperationException;

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
        commandMap.put("view/admin", new AdminCommand());
        commandMap.put("view/login", new LoginCommand());
        commandMap.put("view/departament", new DepartamentCommand());
        commandMap.put("view/registration", new RegistrationCommand());
        commandMap.put("view/sendnotification", new SendNotificatioinCommand());
        commandMap.put("view/setmarks", new SetMarksCommand());
        commandMap.put("view/studentpage", new StudentPageCommand());
        commandMap.put("view/studentrating", new StudentRatingCommand());
    }

    public static Command getCommand(String url) throws NotFoundOperationException {
        Command command = commandMap.get(url);
        if (command == null) {
            throw new NotFoundOperationException();
        }
        return command;
    }

}





