

import controller.validation.RegistrationUtil;
import model.entity.Student;
import model.service.StudentService;
import model.service.impl.StudentServiceImpl;


public class MAIN {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        Student student = studentService.findById(3);
        RegistrationUtil registrationUtil = new RegistrationUtil();
    //    System.out.println(registrationUtil.verificate(student.getEmail(), student.getPassword(), student.getNameUa(), student.getSurnameUa(), student.getNameEn(), student.getSurnameEn()));
       // System.out.println(registrationUtil.userExist("admin"));
    }

}
