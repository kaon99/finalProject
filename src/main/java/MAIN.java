

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
        RatingService ratingService = new RatingServiceImpl();
        String email = "kaon199999@gmail.com";
        Integer subjectId = 1;
        Integer assessment = 100;

        ratingService.setmark(email,subjectId,assessment);


    }
}
