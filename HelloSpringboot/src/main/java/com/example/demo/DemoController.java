package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String getVidu2(HttpServletRequest thamso, ModelMap m) {
		String tenNhanDuoc = thamso.getParameter("ten");
		String mkNhanDuoc = thamso.getParameter("mk");
		m.addAttribute("name", tenNhanDuoc);
		m.addAttribute("pass", mkNhanDuoc);
		return "index2";
	}
	
	@GetMapping("/vd3")
	public String getVidu3(@RequestParam("ten") String tenP, @RequestParam("mk") String mkP, ModelMap m) {
		m.addAttribute("name", tenP);
		m.addAttribute("pass", mkP);
		return "index2";
	}
	
	@GetMapping("/login")
	public String dangNhap() {
		return "login";
	}
	
	@PostMapping("/vd4")
	public String getVidu4(HttpServletRequest thamso, ModelMap m) {
		String tenNhanDuoc = thamso.getParameter("4ten");
		String mkNhanDuoc = thamso.getParameter("4mk");
		m.addAttribute("name", tenNhanDuoc);
		m.addAttribute("pass", mkNhanDuoc);
		return "index4";
	}
}
