import model.dao.SpecialtyDao;
import model.dao.daoimpl.SpecialtyDaoImpl;
import model.entity.Specialty;
import model.entity.Subject;
import model.service.SubjectService;
import model.service.impl.SpecialtyServiceImpl;
import model.service.impl.SubjectServiceImpl;

import java.util.List;

public class MAIN {
    public static void main(String[] args) {
        SpecialtyDao specialtyDao = new SpecialtyDaoImpl();
        Specialty specialty = new Specialty(3,"Cooker");
        //System.out.print(specialtyDao.findById(3));
      specialtyDao.findAll().stream().forEach(System.out::println);

    }
}
