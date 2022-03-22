
import java.util.Scanner;

public class SinhVien {
    String MaSinhVien;
    String HoTen;
    Boolean GioiTinh;
    String DiaChi;
    String NgaySinh;
    
    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
        MaSinhVien = sc.nextLine();
        System.out.print("Ho ten: ");
        HoTen = sc.nextLine();
        System.out.print("Gioi tinh: ");
        GioiTinh = sc.nextBoolean();
        System.out.print("Dia chi: ");
        DiaChi = sc.nextLine();
        System.out.print("Ngay sinh: ");
        NgaySinh = sc.nextLine();
    }
    void inThongTin(){
        System.out.print("Ma sinh vien: " + MaSinhVien);
        System.out.print("Ho ten: " + HoTen);
        if(GioiTinh == true){
            System.out.print("Gioi tinh: Nam");
        }
        else{
            System.out.print("Gioi tinh: Nu");
        }
        System.out.print("Dia chi: " + DiaChi);
        System.out.print("Ngay sinh: " + NgaySinh);
    }
}
