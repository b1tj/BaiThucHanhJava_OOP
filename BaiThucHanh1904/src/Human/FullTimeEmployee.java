package Human;

public class FullTimeEmployee extends Employee{
    private int soNgayLamThem;

    public FullTimeEmployee(int soNgayLamThem){
        this.soNgayLamThem = soNgayLamThem;
    }

    public String loaiNhanVien(){
        return "Nhan vien full time";
    }

    public void tinhLuong(){
        luong = LUONG_NHAN_VIEN_FULL_TIME_MOT_THANG + soNgayLamThem * LUONG_LAM_THEM_MOT_NGAY;
    }
}
