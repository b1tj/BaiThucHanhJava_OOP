import java.util.Scanner;

public class HinhChuNhat {
    float chieuDai;
    float chieuRong;
    float dienTich;
    float chuVi;


    void nhapDaiRong(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieuDai = sc1.nextFloat();
        System.out.print("Nhap chieu rong: ");
        chieuRong = sc1.nextFloat();
    }
    void tinhChuVi(){
        chuVi = (chieuDai + chieuRong)*2;
        System.out.print("Chu vi HCN: " + chuVi);
    }
    void tinhDienTich(){
        dienTich = chieuDai*chieuRong;
        System.out.print("Dien tich HCN: " + dienTich);
    }
}
