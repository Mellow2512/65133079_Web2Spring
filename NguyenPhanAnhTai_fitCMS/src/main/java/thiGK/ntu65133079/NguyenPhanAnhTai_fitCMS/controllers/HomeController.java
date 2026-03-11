package thiGK.ntu65133079.NguyenPhanAnhTai_fitCMS.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu65133079.NguyenPhanAnhTai_fitCMS.models.Page;
import thiGK.ntu65133079.NguyenPhanAnhTai_fitCMS.models.Post;

@Controller
public class HomeController {
	
	ArrayList<Page> dsTrang = new ArrayList<Page>();
	ArrayList<Post> dsBaiViet = new ArrayList<Post>();
	
	public HomeController() {
		dsTrang.add(new Page("P01", "Trang chủ", "home, main", "Nội dung trang chủ", "none"));
		dsTrang.add(new Page("P02", "Giới thiệu", "about, info", "Nội dung giới thiệu", "P01"));
		dsTrang.add(new Page("P03", "Liên hệ", "contact, phone", "Nội dung liên hệ", "none"));
	}
	
	@GetMapping("/page/all")
	public String getTatCaTrang(ModelMap m) {
		m.addAttribute("lstPages", dsTrang);
		return "allpage";
	}
	
	@GetMapping("/")
	public String getDashBoard(ModelMap m) {
		return "Dashboard";
	}
}