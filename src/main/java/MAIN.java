

import controller.command.util.EmailSender;
import controller.validation.InputValid;
import controller.validation.ValidationUtil;
import model.exception.UserExistException;
import model.exception.WrongDataException;

import java.util.Optional;


public class MAIN {
    public static void main(String[] args) throws WrongDataException, UserExistException {
Optional<Integer> integer = Optional.ofNullable( Integer.parseInt("d"));
        System.out.println(InputValid.isGradeValid(integer));
    }

}
