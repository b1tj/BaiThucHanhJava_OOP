package App79.model;

import App79.util.Configs;

public class NhanVienFullTime extends NhanVien{
    protected int ngayLamThem;
    protected int chucVu; 

    public NhanVienFullTime(String ten){
        this.ten = ten;
    }

    public NhanVienFullTime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int chucVu){
        this.chucVu = chucVu;
    }

    @Override
    public String loaiNhanVien(){
        if(chucVu == Configs.NHAN_VIEN_SEP){
            return "Nhan vien sep.";
        } else {
            return "Nhan vien linh.";
        }
    }

    public void tinhLuong(){
        if(chucVu == Configs.NHAN_VIEN_SEP){
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}
