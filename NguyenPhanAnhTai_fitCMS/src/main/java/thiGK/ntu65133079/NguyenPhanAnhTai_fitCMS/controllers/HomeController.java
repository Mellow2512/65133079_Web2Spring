package thiGK.ntu65133079.NguyenPhanAnhTai_fitCMS.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

		dsBaiViet.add(new Post("POST01", "Giới thiệu Khoa CNTT ĐH Nha Trang", "Nội dung bài viết 1", "CAT01"));
		dsBaiViet.add(new Post("POST02", "Thông báo lịch thi giữa kỳ", "Nội dung bài viết 2", "CAT02"));
		dsBaiViet.add(new Post("POST03", "Hướng dẫn làm đồ án chuyên ngành", "Nội dung bài viết 3", "CAT01"));
	}
	
	@GetMapping("/page/all")
	public String getTatCaTrang(ModelMap m) {
		m.addAttribute("lstPages", dsTrang);
		return "allpage"; 
	}

	@GetMapping("/post/all")
	public String getTatCaBaiViet(ModelMap m) {
		m.addAttribute("lstPosts", dsBaiViet);
		return "allpost";
	}
	
	@GetMapping("/")
	public String getDashboard() {
		return "Dashboard";
	}
	
	@GetMapping("/page/new")
	public String themMoiPage(ModelMap m) {
		m.addAttribute("page", new Page("", "", "", "", ""));
		return "formpage"; 
	}

	@GetMapping("/page/edit/{id}")
	public String suaPage(@PathVariable("id") String id, ModelMap m) {
		for (Page p : dsTrang) {
			if (p.getId().equals(id)) {
				m.addAttribute("page", p);
				break;
			}
		}
		return "formpage";
	}

	@PostMapping("/page/save")
	public String luuPage(@ModelAttribute("page") Page page) {
		boolean isUpdate = false;
		for (int i = 0; i < dsTrang.size(); i++) {
			if (dsTrang.get(i).getId().equals(page.getId())) {
				dsTrang.set(i, page); 
				isUpdate = true;
				break;
			}
		}
		if (!isUpdate) {
			dsTrang.add(page);
		}
		return "redirect:/page/all"; 
	}

	@GetMapping("/page/view/{id}")
	public String xemPage(@PathVariable("id") String id, ModelMap m) {
		for (Page p : dsTrang) {
			if (p.getId().equals(id)) {
				m.addAttribute("page", p);
				break;
			}
		}
		return "viewpage";
	}

	@GetMapping("/page/delete/{id}")
	public String xoaPage(@PathVariable("id") String id) {
		dsTrang.removeIf(p -> p.getId().equals(id));
		return "redirect:/page/all";
	}
}