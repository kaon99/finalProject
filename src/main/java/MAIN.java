
import model.dao.StudentDao;
import model.dao.daoimpl.StudentDaoImpl;
import model.entity.Student;


public class MAIN {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();
        Student student = studentDao.findById(1);
        studentDao.setSumMarks(student);
    }
}
