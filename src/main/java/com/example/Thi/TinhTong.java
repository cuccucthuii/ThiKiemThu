package com.example.Thi;

public class TinhTong {

    public Integer tinhTong(int[] daySo){
        if (daySo == null || daySo.length<0){
            return null;
        }
        int tong = 0;
        for (int so: daySo){
           if (so % 2 == 0 && so % 8 != 0){
               tong += so;
           }
        }
        return tong;
    }
}
