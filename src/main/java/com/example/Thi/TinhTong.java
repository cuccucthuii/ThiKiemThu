package com.example.Thi;

public class TinhTong {

    public int tinhTong(int[] daySo){
        int tong = 0;
        for (int so: daySo){
           if (so % 2 == 0 && so % 8 != 0){
               tong += so;
           }
        }
        return tong;
    }
}
