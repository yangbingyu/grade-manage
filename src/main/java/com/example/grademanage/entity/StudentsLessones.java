package com.example.grademanage.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class StudentsLessones implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "s_id")
    private Students students;

    @ManyToOne
    @JoinColumn(name = "l_id")
    private Lessones lessones;

    private float score;

    public StudentsLessones() {
    }

    public StudentsLessones(Students students, Lessones lessones, float score) {
        this.students = students;
        this.lessones = lessones;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Lessones getLessones() {
        return lessones;
    }

    public void setLessones(Lessones lessones) {
        this.lessones = lessones;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

}
