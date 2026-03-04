package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class ThongTinSinhVienApplication {
    public static void main(String[] args) {
        SpringApplication.run(ThongTinSinhVienApplication.class, args);
    }
    //Bai2
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
    
    //Bai3
    @GetMapping("/form-nhap-sv")
    public String hienThiForm() {
        return "nhap-sinhvien"; 
    }

    @PostMapping("/xu-ly-sv")
    public String xuLyDuLieu(
            @RequestParam("mssv") String mssvNhanDuoc,
            @RequestParam("hoTen") String hoTenNhanDuoc,
            @RequestParam("namSinh") int namSinhNhanDuoc,
            @RequestParam("gioiTinh") String gioiTinhNhanDuoc,
            ModelMap m) {

        m.addAttribute("maSo", mssvNhanDuoc);
        m.addAttribute("tenSV", hoTenNhanDuoc);
        m.addAttribute("namS", namSinhNhanDuoc);
        m.addAttribute("phai", gioiTinhNhanDuoc);

        return "sinhvien";
    }
}