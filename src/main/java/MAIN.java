
import model.dao.StudentDao;
import model.dao.daoimpl.StudentDaoImpl;
import model.entity.Rating;
import model.entity.Student;
import model.service.RatingService;
import model.service.impl.RatingServiceImpl;


public class MAIN {
    public static void main(String[] args) {
        RatingService ratingService = new RatingServiceImpl();
         Rating rating  = ratingService.findById(1);
        System.out.println(rating);
    }
}
