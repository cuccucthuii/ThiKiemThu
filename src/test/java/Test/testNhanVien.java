package Test;

import com.example.Thi.NhanVien;
import com.example.Thi.NhanVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testNhanVien {
    private NhanVien nv1, nv2;
    private NhanVienService service;

    @BeforeEach
    public void setUp(){
        service = new NhanVienService();
        nv1 = new NhanVien("NV1","Nguyen Van A",25,12000000,3,"Marketing");
        nv2 = new NhanVien("NV2","Nguyen Van B",22,15000000,2,"IT");
        service.add(nv1);
        service.add(nv2);
    }

    // Sua nhan vien
    @Test
    public void suaNhanVien01(){
        boolean ketQua = service.sua(nv1,"Nguyen Van Anh",29,20000000,7,"Marketing");
        Assertions.assertTrue(ketQua);
    }

    // 5 test case
    // Tuoi o gia tri nho nhat - 18
    @Test
    public void suaNhanVien_TuoiMin(){
        boolean ketQua = service.sua(nv2,"Nguyen Van B",18,15000000,2,"IT");
        Assertions.assertTrue(ketQua);
    }
    // Tuoi o gia tri can nho nhat - 19
    @Test
    public void suaNhanVien_TuoiCanMin(){
        boolean ketQua = service.sua(nv2,"Nguyen Van B",19,15000000,2,"IT");
        Assertions.assertTrue(ketQua);
    }
    // So nam lam viec max -- 50
    @Test
    public void suaNhanVien_TuoiNhoHonMin(){
        boolean ketQua = service.sua(nv2,"Nguyen Van B",25,15000000,50,"IT");
        Assertions.assertTrue(ketQua);
    }
    // Luong o gia tri max - 200000000
    @Test
    public void suaNhanVien_LuongMax(){
        boolean ketQua = service.sua(nv2,"Nguyen Van B",25,200000000,2,"IT");
        Assertions.assertTrue(ketQua);
    }
    // Luong o gia tri min -- 1000000
    @Test
    public void suaNhanVien_LuongMin(){
        boolean ketQua = service.sua(nv2,"Nguyen Van B",25,1000000,2,"IT");
        Assertions.assertTrue(ketQua);
    }

    // Validate cac truong

    // Ten
    @Test
    public void suaNhanVien_TenNull(){
        boolean ketQua = service.sua(nv2,"",25,1000000,2,"IT");
        Assertions.assertTrue(ketQua);
    }

    // Tuoi min 18 - 70
    @Test
    public void suaNhanVien_TuoiFalse(){
        boolean ketQua = service.sua(nv2,"A",17,1000000,2,"IT");
        Assertions.assertTrue(ketQua);
    }

    // Luong min 1tr - 200tr
    @Test
    public void suaNhanVien_LuongFalse(){
        boolean ketQua = service.sua(nv2,"A",25,999999,2,"IT");
        Assertions.assertTrue(ketQua);
    }

    // Tham nien 1 - 50
    @Test
    public void suaNhanVien_NamFalse(){
        boolean ketQua = service.sua(nv2,"A",25,2000000,0,"IT");
        Assertions.assertTrue(ketQua);
    }

    // PhongBan
    @Test
    public void suaNhanVien_PhongBanNull(){
        boolean ketQua = service.sua(nv2,"A",25,2000000,20,"");
        Assertions.assertTrue(ketQua);
    }
}
