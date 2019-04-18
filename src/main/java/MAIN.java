

import controller.command.util.EmailSender;
import model.exception.UserExistException;
import model.exception.WrongDataException;


public class MAIN {
    public static void main(String[] args) throws WrongDataException, UserExistException {
        EmailSender.send("oleg.shved.shvets@gmail.com");
    }

}
