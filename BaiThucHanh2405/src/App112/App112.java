package App112;

import java.util.LinkedList;
import java.util.Scanner;

public class App112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<SinhVien> sinhVienList = new LinkedList<>();
        while(true){
            System.out.println("Nhap thong tin sinh vien: ");
            SinhVien sv = new SinhVien();
            System.out.println("Nhap ten sinh vien:");
            sv.tenSV = sc.nextLine();
            if(sv.tenSV.isEmpty()){
                break;
            }
            System.out.println("Nhap diem sinh vien:");
            sv.diemSV = Integer.parseInt(sc.nextLine());
            sinhVienList.add(sv);
        };
        for(int i = 0; i < sinhVienList.size(); i++){
            show(sinhVienList.get(i),(i+1));
        }
        
        System.out.println("Danh sach sinh vien thi lai:");
        for(int i = 0; i < sinhVienList.size(); i++){
            if(sinhVienList.get(i).diemSV <= 5){
                show(sinhVienList.get(i),(i+1));
            }
        }

        //tim sinh vien diem cao nhat
        float max = sinhVienList.get(0).diemSV;
        for(int i = 0; i < sinhVienList.size(); i++){
            if(sinhVienList.get(i).diemSV > max){
                max = sinhVienList.get(i).diemSV;
            }
        }
        //in danh sach sinh vien diem cao nhat
        for(int i = 0; i < sinhVienList.size(); i++){
            if(sinhVienList.get(i).diemSV == max){
                show(sinhVienList.get(i),(i+1));
            }
        }

        //Tim kiem sinh vien theo ten
        String name;
        System.out.println("Nhap ten sinh vien can tim:");
        name = sc.nextLine();
        for(int i = 0; i < sinhVienList.size(); i++){
            if(sinhVienList.get(i).tenSV == name){
                show(sinhVienList.get(i),(i+1));
            }
        }
    }
    public static void show(SinhVien sv, int i){
        System.out.println("Thong tin sinh vien thu " + i + " :");
        System.out.print("Ten sinh vien: " + sv.tenSV);
        System.out.println();
        System.out.print("Diem sinh vien: " + sv.diemSV);
        System.out.println();
        System.out.println("_____________");
    }
}
