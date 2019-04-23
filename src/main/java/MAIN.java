

import controller.command.util.EmailSender;
import controller.validation.InputValid;
import controller.validation.ValidationUtil;
import model.exception.UserExistException;
import model.exception.WrongDataException;

import java.util.Optional;


public class MAIN {
    public static void main(String[] args) throws WrongDataException, UserExistException {
Integer integer  = -10;
        System.out.println(InputValid.isGradeValid(integer));
    }

}
