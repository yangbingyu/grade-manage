package com.example.grademanage.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Classes {

    @Id
    @GeneratedValue
    private int cId;

    private String cName;

    @OneToMany(mappedBy = "classes", fetch = FetchType.EAGER)
    private List<Students> students;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.EAGER)
    @JoinColumn(name = "d_id")
    private Departments departments;

    @ManyToMany(mappedBy = "classesList")
    private List<Teachers> teachersList;

    public Classes() {
    }

    public Classes(String cName, Departments departments, List<Teachers> teachersList) {
        this.cName = cName;
        this.departments = departments;
        this.teachersList = teachersList;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Departments getDepartments() {
        return departments;
    }

    public void setDepartments(Departments departments) {
        this.departments = departments;
    }

    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(List<Teachers> teachersList) {
        this.teachersList = teachersList;
    }

}
