package NhanVien;
import java.util.Scanner;

public class NhanVien{
    public String maNV;
    public String tenNV;
    public String diaChi;

    public NhanVien(){

    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien:");
        maNV = sc.nextLine();
        System.out.println("Nhap ten nhan vien:");
        tenNV = sc.nextLine();
        System.out.println("Nhap dia chi nhan vien:");
        diaChi = sc.nextLine();
    }

}

//2021050800