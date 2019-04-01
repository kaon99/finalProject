package model.entity;

public class Rating {

    private Integer id;
    private Integer assessment;
    private Integer subjectId;
    private Integer studentId;
    private Integer specialtyId;



    public Rating() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAssessment() {
        return assessment;
    }

    public void setAssessment(Integer assessment) {
        this.assessment = assessment;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Integer getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(int specialtyId) {
        this.specialtyId = specialtyId;
    }

}
