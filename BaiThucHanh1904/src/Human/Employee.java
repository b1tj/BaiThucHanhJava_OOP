package Human;

public class Employee extends Person{
    public long luong;

    public static final long LUONG_NHAN_VIEN_FULL_TIME_MOT_THANG = 5000000;
    public static final long LUONG_NHAN_VIEN_PART_TIME_MOT_NGAY = 200000;
    public static final long LUONG_LAM_THEM_MOT_NGAY = 300000;
    public static final long LUONG_LAM_THEM_MOT_GIO = 50000;
    public Employee(){

    }

    public void inThongTin(){
        inTen();
        inSoDienThoai();
        inDiaChi();
        System.out.println("Luong: " + luong);
    }

    public String loaiNhanVien(){
        return "";
    }

}
