package Test;

import com.example.Thi.TinhTong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testTinhTong {
    private TinhTong tt = new TinhTong();

    @Test
    public void setTt01(){
        int[] daySo = {2,4,8,10,16};
        Assertions.assertEquals(16,tt.tinhTong(daySo));
    }

    @Test
    public void setTt02(){
        int[] daySo = {20,40,8,10,16};
        Assertions.assertEquals(30,tt.tinhTong(daySo));
    }

    @Test
    public void setTt03(){
        int[] daySo = {11,12,13,14,16};
        Assertions.assertEquals(26,tt.tinhTong(daySo));
    }

    @Test
    public void setTt04(){
        int[] daySo = {11,4,8,7,16};
        Assertions.assertEquals(4,tt.tinhTong(daySo));
    }

    @Test
    public void setTt05(){
        int[] daySo = {19,40,18,6,2};
        Assertions.assertEquals(26,tt.tinhTong(daySo));
    }
}
