package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ThongTinSinhVienApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThongTinSinhVienApplication.class, args);
    }

    @GetMapping("/thongtin-sv")
    public String hienThiThongTinSV(ModelMap m) {
        String mssv = "65133079";
        String hoTen = "Nguyễn Phan Anh Tài";
        int namSinh = 2005;
        String gioiTinh = "Nam";
        
        m.addAttribute("maSo", mssv);
        m.addAttribute("tenSV", hoTen);
        m.addAttribute("namS", namSinh);
        m.addAttribute("phai", gioiTinh);
        
        return "sinhvien";
    }
}