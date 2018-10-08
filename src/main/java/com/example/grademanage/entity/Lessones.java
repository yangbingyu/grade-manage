package com.example.grademanage.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Lessones {

    @Id
    @GeneratedValue
    private int lId;

    private String lName;

    private int lCredit;

    private String lGrade;

    @OneToMany(mappedBy = "lessones",fetch=FetchType.EAGER)
    private List<StudentsLessones> studentLessonesList = new ArrayList<>();

    @ManyToMany(mappedBy = "lessonesList")
    private List<Teachers> teachersList = new ArrayList<>();

//    @ManyToMany(cascade = CascadeType.PERSIST, fetch=FetchType.LAZY)
//    @JoinTable(name="students_lessones",joinColumns={@JoinColumn(name="l_id")},inverseJoinColumns={@JoinColumn(name="s_id")})
//    private List<Students> students = new ArrayList<>();

    @ManyToMany(mappedBy = "lessonesList")
    private List<Departments> departmentsList = new ArrayList<>();

    public Lessones() {
    }

    public Lessones(String lName, int lCredit, String lGrade, List<StudentsLessones> studentLessonesList, List<Teachers> teachersList, List<Departments> departmentsList) {
        this.lName = lName;
        this.lCredit = lCredit;
        this.lGrade = lGrade;
        this.studentLessonesList = studentLessonesList;
        this.teachersList = teachersList;
        this.departmentsList = departmentsList;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getlCredit() {
        return lCredit;
    }

    public void setlCredit(int lCredit) {
        this.lCredit = lCredit;
    }

    public String getlGrade() {
        return lGrade;
    }

    public void setlGrade(String lGrade) {
        this.lGrade = lGrade;
    }

    public List<StudentsLessones> getStudentLessonesList() {
        return studentLessonesList;
    }

    public void setStudentLessonesList(List<StudentsLessones> studentLessonesList) {
        this.studentLessonesList = studentLessonesList;
    }

    public List<Teachers> getTeachersList() {
        return teachersList;
    }

    public void setTeachersList(List<Teachers> teachersList) {
        this.teachersList = teachersList;
    }

    public List<Departments> getDepartmentsList() {
        return departmentsList;
    }

    public void setDepartmentsList(List<Departments> departmentsList) {
        this.departmentsList = departmentsList;
    }

//    public List<Students> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Students> students) {
//        this.students = students;
//    }

}
