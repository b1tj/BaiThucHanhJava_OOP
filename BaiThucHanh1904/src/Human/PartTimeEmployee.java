package Human;

public class PartTimeEmployee extends Employee{
    private int soGioLamThem;

    public PartTimeEmployee(int soGioLamThem){
        this.soGioLamThem = soGioLamThem;
    }

    public String loaiNhanVien(){
        return "Nhan vien part time";
    }

    public void tinhLuong(){
        luong = LUONG_NHAN_VIEN_PART_TIME_MOT_NGAY + LUONG_LAM_THEM_MOT_GIO * soGioLamThem;
    }

}
