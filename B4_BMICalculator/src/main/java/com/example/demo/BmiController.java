package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BmiController {

    @GetMapping("/")
    public String showCalculator() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculateBmi(
            @RequestParam("weight") double weight,
            @RequestParam("height") double height,
            Model model) {

        if (height <= 0 || weight <= 0) {
            model.addAttribute("error", "Vui lòng nhập chiều cao và cân nặng lớn hơn 0!");
            return "index";
        }

        double heightInMeters = height / 100.0;
        
        double bmi = weight / (heightInMeters * heightInMeters);
        
        bmi = Math.round(bmi * 100.0) / 100.0;

        String category;
        if (bmi < 18.5) {
            category = "Gầy";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            category = "Bình thường";
        } else if (bmi >= 25 && bmi <= 29.9) {
            category = "Thừa cân";
        } else {
            category = "Béo phì";
        }

        model.addAttribute("weight", weight);
        model.addAttribute("height", height);
        model.addAttribute("bmi", bmi);
        model.addAttribute("category", category);

        return "index";
    }
}