import NhanVien.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppArr {
    public static void main(String[] args) throws Exception {
        ArrayList<NhanVien> listNhanVien = new ArrayList<>(Arrays.asList());
        for(int i = 0; i < n; i++){
            NhanVien nv = new NhanVien();
            nv.nhapThongTin();
            listNhanVien.add(nv);
        }   
    }
}

//2021050800
