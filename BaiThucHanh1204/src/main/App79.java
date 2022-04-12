package main;

import App79.model.NhanVienFullTime;
import App79.model.NhanVienPartTime;
import App79.util.Configs;
public class App79 {
    public static void main(String[] args) throws Exception {
        //Cong ty co 3 nhan vien fulltime, co 1 sep va khong lam them ngay nao
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van Sep");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);

        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van Linh");//khong lam them
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);

        NhanVienFullTime linh2 = new NhanVienFullTime("Trinh Thi Linh", 2);// lam them 2 ngay
        linh1.setLoaiChucVu(Configs.NHAN_VIEN_LINH);

        //Cong ty co 1 nhan vien thoi vu
        NhanVienPartTime thoiVu = new NhanVienPartTime("Le Thi Thoi Vu", 70);

        //Tinh luong
        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        thoiVu.tinhLuong();
        //In thong tin nhan vien
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        thoiVu.xuatThongTin();
    }
}
