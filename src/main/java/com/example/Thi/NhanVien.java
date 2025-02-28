package com.example.Thi;

public class NhanVien {
    private String ma;
    private String ten;
    private int tuoi;
    private float luong;
    private int soNamLamViec;
    private String phongBan;

    public NhanVien(String ma, String ten, int tuoi, float luong, int soNamLamViec, String phongBan) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
        this.soNamLamViec = soNamLamViec;
        this.phongBan = phongBan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public int getSoNamLamViec() {
        return soNamLamViec;
    }

    public void setSoNamLamViec(int soNamLamViec) {
        this.soNamLamViec = soNamLamViec;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", luong=" + luong +
                ", soNamLamViec=" + soNamLamViec +
                ", phongBan='" + phongBan + '\'' +
                '}';
    }
}
