package model.entity;

import java.util.List;

public class Departament {

    private Integer id;
    private Integer subjectId;
    private  Integer specialtieId;

    public Departament() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getSpecialtieId() {
        return specialtieId;
    }

    public void setSpecialtieId(Integer specialtieId) {
        this.specialtieId = specialtieId;
    }

}
