import java.util.LinkedList;
import java.util.Scanner;

import SinhVien.SinhVien;

public class App112 {
    public static void main(String[] args) throws Exception{
        LinkedList<SinhVien> sinhViens = new LinkedList<>();
        String ten;
        int diem;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap ho ten sinh vien: ");
            ten = sc.nextLine();
            if(ten != ""){
                System.out.println("Nhap diem sinh vien: ");
                diem = sc.nextInt();
                sinhViens.add(new SinhVien(ten, diem));
            }
        }   while(ten != "");

        int dem = 0;
        LinkedList<SinhVien> sinhViens2 = new LinkedList<>();
        for(int i = 0; i < sinhViens.size(); i++){
            if(sinhViens.get(i).diemSV <= 5){
                sinhViens2.add(sinhViens.get(i));
                dem++;
            }
        }
        System.out.println("So sinh vien phai thi lai: " + dem);
        System.out.println("Danh sach sinh vien thi lai: ");
        System.out.println(sinhViens2);

        int max = sinhViens.get(0).diemSV;
        for(int i = 0; i < sinhViens.size(); i++){
            if(sinhViens.get(i).diemSV > max){
                max = sinhViens.get(i).diemSV;
            }
        }

        LinkedList<SinhVien> sinhViens3 = new LinkedList<>();
        for(SinhVien number : sinhViens){
            if(number.diemSV == max){
                sinhViens3.add(number);
            }
        }
        System.out.println("Danh sach cac sinh vien co diem cao nhat: " + sinhViens3);

        System.out.println("Nhap ten sinh vien can tim:");
        String temp = sc.nextLine();
        for(int i = 0; i < sinhViens.size(); i++){
            if(sinhViens.get(i).tenSV == temp){
                System.out.println("Danh sach sinh vien co ten: " + temp);
                System.out.println(sinhViens.get(i));
            }
        }
    }
}

//2021050800
