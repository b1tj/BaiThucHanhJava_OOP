package Human;

import java.util.Scanner;

public class Customer extends Person{
    protected long tongGiaTriDonHang;

    public Customer(){

    }

    public void nhapGiaTriDonHang(){
        System.out.println("Nhap gia tri don hang: ");
        Scanner sc = new Scanner(System.in);
        tongGiaTriDonHang = sc.nextLong();
    }
    public void nhapThongTin(){
        nhapTen();
        nhapSoDienThoai();
        nhapDiaChi();
        nhapGiaTriDonHang();
    }

    public void inThongTin(){
        System.out.println("Ten: " + ten);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Tong gia tri don hang: " + tongGiaTriDonHang);
    }
}
