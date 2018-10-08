package com.example.grademanage.service.Impl;

import com.example.grademanage.entity.Lessones;
import com.example.grademanage.entity.StudentsLessones;
import com.example.grademanage.repository.LessonesRepository;
import com.example.grademanage.repository.StudentLessonesRepositiry;
import com.example.grademanage.repository.StudentRepository;
import com.example.grademanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private LessonesRepository lessonesRepository;
    @Autowired
    private StudentLessonesRepositiry studentLessonesRepositiry;

    @Override
    public List<StudentsLessones> findScoreBySId(int sId) {

        System.out.println("sdsd"+studentLessonesRepositiry.findScoreBySId(sId));
        return studentLessonesRepositiry.findScoreBySId(sId);
    }

    @Override
    public List<StudentsLessones> findScoreBySIdAndLessones(int sId, String lName) {

        return studentLessonesRepositiry.findScoreBySIdAndLessones(sId, lName);
    }

    @Override
    public List<StudentsLessones> findScoreBySIdPass(int sId) {

        return studentLessonesRepositiry.findScoreBySIdPass(sId);
    }

    @Override
    public List<StudentsLessones> findScoreBySIdPassAndLessones(int sId, String lName) {

        return studentLessonesRepositiry.findScoreBySIdPassAndLessones(sId, lName);
    }
}
