package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Student;

@Controller
public class StudentController {

    @GetMapping("/student-info")
    public String showStudentInfo(Model model) {
        Student myStudent = new Student("65133079", "Nguyễn Phan Anh Tài", 8.5);

        model.addAttribute("sv", myStudent);

        return "student";
    }
}