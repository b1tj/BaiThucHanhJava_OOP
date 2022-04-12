package App79.model;

import App79.util.Configs;
public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien(){
        return "Nhan vien thoi vu.";
    }

    public void tinhLuong(){
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
}
