package model.entity;

import model.entity.types.Role;

public class Student {
    private Integer id;
    private String NameUa;
    private String SurnameUa;
    private String NameEn;
    private String SurnameEn;
    private String email;
    private String password;
    private Integer role;

    public Student() {
    }

    public Student(Integer id, String nameUa, String surnameUa, String nameEn, String surnameEn, String email, String password, Integer role) {
        this.id = id;
        NameUa = nameUa;
        SurnameUa = surnameUa;
        NameEn = nameEn;
        SurnameEn = surnameEn;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameUa() {
        return NameUa;
    }

    public void setNameUa(String nameUa) {
        NameUa = nameUa;
    }

    public String getSurnameUa() {
        return SurnameUa;
    }

    public void setSurnameUa(String surnameUa) {
        SurnameUa = surnameUa;
    }

    public String getNameEn() {
        return NameEn;
    }

    public void setNameEn(String nameEn) {
        NameEn = nameEn;
    }

    public String getSurnameEn() {
        return SurnameEn;
    }

    public void setSurnameEn(String surnameEn) {
        SurnameEn = surnameEn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (NameUa != null ? !NameUa.equals(student.NameUa) : student.NameUa != null) return false;
        if (SurnameUa != null ? !SurnameUa.equals(student.SurnameUa) : student.SurnameUa != null) return false;
        if (NameEn != null ? !NameEn.equals(student.NameEn) : student.NameEn != null) return false;
        if (SurnameEn != null ? !SurnameEn.equals(student.SurnameEn) : student.SurnameEn != null) return false;
        if (email != null ? !email.equals(student.email) : student.email != null) return false;
        if (password != null ? !password.equals(student.password) : student.password != null) return false;
        return role != null ? role.equals(student.role) : student.role == null;
    }

    @Override
    public int hashCode() {
        int result = NameUa != null ? NameUa.hashCode() : 0;
        result = 31 * result + (SurnameUa != null ? SurnameUa.hashCode() : 0);
        result = 31 * result + (NameEn != null ? NameEn.hashCode() : 0);
        result = 31 * result + (SurnameEn != null ? SurnameEn.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }
}
