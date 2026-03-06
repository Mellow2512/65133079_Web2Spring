package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Student;

@Controller
public class StudentController {

    @GetMapping("/danh-sach")
    public String showStudentList(Model model) {
        List<Student> listStudent = new ArrayList<>();

        listStudent.add(new Student("65133079", "Nguyễn Phan Anh Tài", 8.5));
        listStudent.add(new Student("65134028", "Nguyễn Hồng Trường", 10.0));
        listStudent.add(new Student("65131234", "Nguyễn Văn A", 9.2));
        listStudent.add(new Student("65135678", "Phạm Thị B", 4.5));

        model.addAttribute("danhSachSV", listStudent);

        return "danh-sach";
    }
}