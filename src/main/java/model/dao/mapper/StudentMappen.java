package model.dao.mapper;

import model.entity.Student;
import model.entity.types.Role;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Map;

public class StudentMappen implements ObjectMapper<Student> {
    @Override
    public Student extractFromResultSet(ResultSet rs) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("user_id"));
        student.setNameUa(rs.getString("user_name_ua"));
        student.setNameEn(rs.getString("user_name_en"));
        student.setSurnameUa(rs.getString("user_surname_ua"));
        student.setSurnameEn(rs.getString("user_surname_en"));
        student.setEmail(rs.getString("user_email"));
        student.setPassword(rs.getString("user_email"));
        student.setRole(rs.getInt("user_role"));

        return student;
    }

    @Override
    public Student makeUnique(Map<Integer, Student> cache, Student student) {
        return null;
    }
}
