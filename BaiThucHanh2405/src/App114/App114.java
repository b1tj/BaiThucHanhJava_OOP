package App114;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App114 {
    public static void main(String[] args) {
        HashMap<String,SinhVien> svMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n:");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap danh sach sinh vien:");
        for(int i = 0; i < n; i++){
            System.out.println("Nhap sinh vien thu " + (i+1) + " :");
            SinhVien sv = new SinhVien();
            nhapSV(sv);
            svMap.put(sv.maSV,sv);
        }

        System.out.println("Nhap ten lop");
        String lop;
        lop = sc.nextLine();
        Set<Map.Entry<String,SinhVien>> set = svMap.entrySet();
        System.out.println("Danh sach sinh vien thuoc lop vua nhap:");
        System.out.println();
        int i = 1;
        for (Map.Entry<String,SinhVien> entry : set) {
            System.out.println("_____Sinh vien thu " + i + " _____");
            if(entry.getValue().lop == lop){
                xuatSV(entry);
                i++;
            }
        }
        
        //Hien thi ho ten lop tuong ung ma sv
        System.out.println("Nhap ma sinh vien:");
        String maSV = sc.nextLine();
        for (Map.Entry<String,SinhVien> entry : set) {
            if(entry.getKey() == maSV){
                System.out.println("Ten sinh vien: " + entry.getValue().hoTen);
                System.out.println("Lop: " + entry.getValue().lop);
            }
        }





    }
    public static void nhapSV(SinhVien sv){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien:");
        sv.maSV = sc.nextLine();
        System.out.println("Nhap ten sinh vien:");
        sv.hoTen = sc.nextLine();
        System.out.println("Nhap lop sinh vien:");
        sv.lop = sc.nextLine();
        System.out.println();
    }
    public static void xuatSV(Map.Entry<String,SinhVien> sv){
        System.out.println("Ma sinh vien: " + sv.getValue().maSV);
        System.out.println("Ten sinh vien: " + sv.getValue().hoTen);
        System.out.println("Lop: " + sv.getValue().lop);
        System.out.println();
    }
}
