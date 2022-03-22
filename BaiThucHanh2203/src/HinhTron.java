import java.util.Scanner;
class HinhTron{
    float banKinh;
    final float PI = 3.14f;
    float chuVi;
    float dienTich;
    void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
    }
    void tinhChuVi(){
        chuVi = 2*PI*banKinh;
    }
    void tinhDienTich(){
        dienTich = PI*banKinh*banKinh;
    }
    void inBanKinh(){
        System.out.println("Ban kinh: " + banKinh);
    }
    void inDienTich(){
        System.out.println("Dien tich: " + dienTich);
    }
    void inChuVi(){
        System.out.println("Chu vi: " + chuVi);
    }
}
