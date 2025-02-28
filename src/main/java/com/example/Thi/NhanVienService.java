package com.example.Thi;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    private List<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void add(NhanVien nhanVien){
        danhSachNhanVien.add(nhanVien);
    }

    public boolean sua(NhanVien nv, String tenMoi, int tuoiMoi, float luongMoi, int soNamMoi, String phongBanMoi){
        if (tenMoi == null || tenMoi.trim().isEmpty() || phongBanMoi == null || phongBanMoi.trim().isEmpty()){
            throw new IllegalArgumentException("Khong duoc de trong!");
        }
        if (tuoiMoi < 18 || tuoiMoi > 70 || soNamMoi < 1 || soNamMoi > 50){
            throw new IllegalArgumentException("Thong tin khong hop le");
        }
        if (luongMoi < 1000000 || luongMoi > 200000000 ){
            throw new IllegalArgumentException("Thong tin khong hop le");
        }
        nv.setTen(tenMoi);
        nv.setTuoi(tuoiMoi);
        nv.setPhongBan(phongBanMoi);
        nv.setLuong(luongMoi);
        nv.setSoNamLamViec(soNamMoi);
        return true;
    }
}
