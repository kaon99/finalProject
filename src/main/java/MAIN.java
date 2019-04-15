

import model.dao.StudentDao;
import model.dao.daoimpl.StudentDaoImpl;
import model.entity.Student;
import model.service.RatingService;
import model.service.StudentService;
import model.service.impl.RatingServiceImpl;
import model.service.impl.StudentServiceImpl;


public class MAIN {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
       Student student = studentService.findById(24);
       studentService.setMarks(student);


    }
}
