package model.entity;

public class Student {
    private Integer id;
    private String nameUa;
    private String surnameUa;
    private String nameEn;
    private String surnameEn;
    private String email;
    private String password;
    private Integer role;

    public Student() {
    }

    public Student(String nameUa, String surnameUa, String nameEn, String surnameEn, String email, String password, Integer role) {
        this.nameUa = nameUa;
        this.surnameUa = surnameUa;
        this.nameEn = nameEn;
        this.surnameEn = surnameEn;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Student(Integer id, String nameUa, String surnameUa, String nameEn, String surnameEn, String email, String password, Integer role) {
        this.id = id;
        this.nameUa = nameUa;
        this.surnameUa = surnameUa;
        this.nameEn = nameEn;
        this.surnameEn = surnameEn;
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
        return nameUa;
    }

    public void setNameUa(String nameUa) {
        this.nameUa = nameUa;
    }

    public String getSurnameUa() {
        return surnameUa;
    }

    public void setSurnameUa(String surnameUa) {
        this.surnameUa = surnameUa;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getSurnameEn() {
        return surnameEn;
    }

    public void setSurnameEn(String surnameEn) {
        this.surnameEn = surnameEn;
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

        if (nameUa != null ? !nameUa.equals(student.nameUa) : student.nameUa != null) return false;
        if (surnameUa != null ? !surnameUa.equals(student.surnameUa) : student.surnameUa != null) return false;
        if (nameEn != null ? !nameEn.equals(student.nameEn) : student.nameEn != null) return false;
        if (surnameEn != null ? !surnameEn.equals(student.surnameEn) : student.surnameEn != null) return false;
        if (email != null ? !email.equals(student.email) : student.email != null) return false;
        if (password != null ? !password.equals(student.password) : student.password != null) return false;
        return role != null ? role.equals(student.role) : student.role == null;
    }

    @Override
    public int hashCode() {
        int result = nameUa != null ? nameUa.hashCode() : 0;
        result = 31 * result + (surnameUa != null ? surnameUa.hashCode() : 0);
        result = 31 * result + (nameEn != null ? nameEn.hashCode() : 0);
        result = 31 * result + (surnameEn != null ? surnameEn.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (role != null ? role.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nameUa='" + nameUa + '\'' +
                ", surnameUa='" + surnameUa + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", surnameEn='" + surnameEn + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
