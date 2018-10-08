package com.example.grademanage.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Students {

    @Id
    @GeneratedValue
    private int sId;

    private String sName;

    private String sSex;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinColumn(name = "c_id")
    private Classes classes;

//    @ManyToMany(cascade = CascadeType.PERSIST, fetch=FetchType.LAZY)
//    @JoinTable(name="students_lessones",joinColumns={@JoinColumn(name="s_id")},inverseJoinColumns={@JoinColumn(name="l_id")})
//    private List<Lessones> lessones = new ArrayList<>();

    @OneToMany(mappedBy = "students",fetch=FetchType.EAGER)
    private List<StudentsLessones> studentLessonesList = new ArrayList<>();

    public Students() {
    }

    public Students(String sName, String sSex, List<StudentsLessones> studentLessonesList) {
        this.sName = sName;
        this.sSex = sSex;
        this.studentLessonesList = studentLessonesList;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsSex() {
        return sSex;
    }

    public void setsSex(String sSex) {
        this.sSex = sSex;
    }

    public List<StudentsLessones> getStudentLessonesList() {
        return studentLessonesList;
    }

    public void setStudentLessonesList(List<StudentsLessones> studentLessonesList) {
        this.studentLessonesList = studentLessonesList;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

//    public List<Lessones> getLessones() {
//        return lessones;
//    }
//
//    public void setLessones(List<Lessones> lessones) {
//        this.lessones = lessones;
//    }

}
