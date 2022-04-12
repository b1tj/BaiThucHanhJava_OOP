package App77;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    protected float banKinh;
    private Scanner sc;


    public HinhTron(){
        super();
        sc = new Scanner(System.in);
    }

    public void nhapBanKinh(){
        System.out.println("Ban dung don vi tinh nao: ");
        System.out.println("\t1 - Centimet.");
        System.out.println("\t2 - Inch.");
        Configs.donVi = sc.nextInt();

        System.out.println("Hay nhap ban kinh hinh tron: ");
        banKinh = sc.nextFloat();
    }

    public void inThongTin(){
        if(Configs.donVi == Configs.DON_VI_CM){
            System.out.println("Hinh tron co ban kinh: " + banKinh + " cm.");
            System.out.println("Tuong duong " + Configs.ChuyenCentimetSangInch(banKinh) + " inch.");
        } else {
            System.out.println("Hinh tron co ban kinh: " + banKinh + " inch.");
            System.out.println("Tuong duong " + Configs.ChuyenInchSangCentimet(banKinh) + " cm.");

        }
    }
}
