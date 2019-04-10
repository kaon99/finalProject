import model.dao.StudentDao;
import model.dao.daoimpl.StudentDaoImpl;
import model.entity.Student;
import model.service.StudentService;
import model.service.impl.StudentServiceImpl;

import java.util.List;

public class MAIN {
    public static void main(String[] args) {
        StudentService studentDao = new StudentServiceImpl();

       studentDao.findAll().stream().forEach(System.out::println);

    }
}
