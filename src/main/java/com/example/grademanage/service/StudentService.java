package com.example.grademanage.service;

import com.example.grademanage.entity.Lessones;
import com.example.grademanage.entity.StudentsLessones;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<StudentsLessones> findScoreBySId(int sId);

    List<StudentsLessones> findScoreBySIdAndLessones(int sId,String lName);

    List<StudentsLessones> findScoreBySIdPass(int sId);

    List<StudentsLessones> findScoreBySIdPassAndLessones(int sId,String lName);
}
