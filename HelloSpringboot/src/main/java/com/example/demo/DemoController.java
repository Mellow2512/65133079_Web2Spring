package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class DemoController {
	@GetMapping("/vd1")
	public String getVidu1(ModelMap m) {
		String kq = "Dữ liệu này đến từ Controller";
		m.addAttribute("tb", kq);
		return "index";
	}
	
	@GetMapping("/vd2")
	public String getMethodName(HttpServletRequest thamso, ModelMap m) {
		String tenNhaDuoc = thamso.getParameter("ten");
		m.addAttribute("name", tenNhaDuoc);
		return "index2";
	}
}
