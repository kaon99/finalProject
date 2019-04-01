package model.dao.mapper;

import model.entity.Departament;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class DepartamentMapper implements ObjectMapper<Departament> {

    @Override
    public Departament extractFromResultSet(ResultSet rs) throws SQLException {
        Departament departament = new Departament();
        departament.setId(rs.getInt("departament_id"));
        departament.setSpecialtieId(rs.getInt("specialty_specialty_id"));
        departament.setSubjectId(rs.getInt("subject_subject_id"));
        return departament;
    }

    @Override
    public Departament makeUnique(Map<Integer, Departament> cache, Departament departament) {
         cache.putIfAbsent(departament.getId(), departament);

        return cache.get(departament.getId());
    }
}
