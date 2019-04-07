import model.entity.Student;
import model.service.StudentService;
import model.service.impl.StudentServiceImpl;

public class MAIN {
    public static void main(String[] args) {
        StudentService s = new StudentServiceImpl();


       Student student= s.loginUser("qw","12");
        System.out.println(student);


    }
}
