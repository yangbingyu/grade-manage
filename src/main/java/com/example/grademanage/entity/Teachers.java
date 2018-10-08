package com.example.grademanage.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teachers {

    @Id
    @GeneratedValue
    private int tId;

    private String tName;

    @ManyToMany
    @JoinTable(name = "teachers_lessones",joinColumns = @JoinColumn(name = "t_id"),
            inverseJoinColumns = @JoinColumn(name = "l_id"))
    private List<Lessones> lessonesList;

    @ManyToMany
    @JoinTable(name = "teachers_classes",joinColumns = @JoinColumn(name = "t_id"),
            inverseJoinColumns = @JoinColumn(name = "c_id"))
    private List<Classes> classesList;


    public Teachers() {
    }

    public Teachers(String tName, List<Lessones> lessonesList, List<Classes> classesList) {
        this.tName = tName;
        this.lessonesList = lessonesList;
        this.classesList = classesList;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public List<Lessones> getLessonesList() {
        return lessonesList;
    }

    public void setLessonesList(List<Lessones> lessonesList) {
        this.lessonesList = lessonesList;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }

}
