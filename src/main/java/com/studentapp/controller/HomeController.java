package com.studentapp.controller;

import com.studentapp.dao.StudentDao;
import com.studentapp.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private StudentDao studentDao;

    @RequestMapping(path = "/home")
    public String loadHome(Model model){
        List<Student> allStudents = studentDao.getAllStudent();
        model.addAttribute("students",allStudents);
        return "home-page";
    }

    @RequestMapping(path = "/new-student")
    public String loadNewStudentPage(){
        return "student-page";
    }

    @RequestMapping(path = "/create-student", method = RequestMethod.POST)
    public String createStudent(@ModelAttribute Student student){
        studentDao.saveStudent(student);
        return "student-page";
    }

}
