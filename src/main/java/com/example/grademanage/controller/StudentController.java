package com.example.grademanage.controller;

import com.example.grademanage.entity.Lessones;
import com.example.grademanage.entity.StudentsLessones;
import com.example.grademanage.repository.StudentLessonesRepositiry;
import com.example.grademanage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;


    @RequestMapping("/findScoreBySId")
    public String findScoreBySId(ModelMap map,HttpServletRequest request){
        String lName = request.getParameter("lName");
        if(lName == null){
            List<StudentsLessones> list = studentService.findScoreBySId(1);
            map.addAttribute("list",list);
        }else if(lName!=null){
            String lName1 = "%"+lName+"%";
            List<StudentsLessones> list = studentService.findScoreBySIdAndLessones(1,lName1);
            map.addAttribute("list",list);
        }

        return "studentScore";
    }

    @RequestMapping("/findScoreBySIdPass")
    public String findScoreBySIdPass(ModelMap map,HttpServletRequest request){
        String lName = request.getParameter("lName");
        if(lName == null) {
            List<StudentsLessones> list = studentService.findScoreBySIdPass(1);
            map.addAttribute("list", list);
        }else if(lName != null){
            String lName1 = "%"+lName+"%";
            List<StudentsLessones> list = studentService.findScoreBySIdPassAndLessones(2,lName1);
            map.addAttribute("list",list);
        }
        return "studentScorePass";
    }
}
