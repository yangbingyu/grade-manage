package com.example.grademanage.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Departments {

    @Id
    @GeneratedValue
    private int dId;

    private String dName;

    @OneToMany(mappedBy = "departments", fetch = FetchType.EAGER)
    private List<Classes> classes;

    @ManyToMany
    @JoinTable(name = "departments_lessons",joinColumns = @JoinColumn(name = "d_id"),
            inverseJoinColumns = @JoinColumn(name = "l_id"))
    private List<Lessones> lessonesList;

    public Departments() {
    }

    public Departments(String dName, List<Classes> classes, List<Lessones> lessonesList) {
        this.dName = dName;
        this.classes = classes;
        this.lessonesList = lessonesList;
    }

    public int getdId() {
        return dId;
    }

    public void setdId(int dId) {
        this.dId = dId;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    public List<Lessones> getLessonesList() {
        return lessonesList;
    }

    public void setLessonesList(List<Lessones> lessonesList) {
        this.lessonesList = lessonesList;
    }

}
