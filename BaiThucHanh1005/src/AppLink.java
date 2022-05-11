import NhanVien.*;

import java.util.LinkedList;
import java.util.Scanner;

public class AppLink {
    public static void main(String[] args) throws Exception {
        LinkedList<NhanVien> listNhanViens = new LinkedList<>();
        int n;
        System.out.println("Nhap so nhan vien:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //Add
        for(int i = 0; i < n; i++){
            NhanVien nv = new NhanVien();
            System.out.println("Nhan thong tien nhan vien thu " + (i+1) + " :");
            nv.nhapThongTin();
            listNhanViens.add(nv);
        }

        //ShowList
        System.out.println("Danh sach nhan vien vua nhap: ");
            for(int i = 0; i < listNhanViens.size(); i++){
                System.out.println("Nhan vien thu " + (i + 1));
                System.out.println("________________");
                System.out.println("Ma nhan vien: " + listNhanViens.get(i).maNV);
                System.out.println("Ten nhan vien: " + listNhanViens.get(i).tenNV);
                System.out.println("Dia chi nhan vien: " + listNhanViens.get(i).diaChi);
            }
        
        //Set
        NhanVien nvTemp1 = new NhanVien();
        int index;
        System.out.println("Nhap vi tri thong tin can sua:");
        index = sc.nextInt();
        System.out.println("Nhap thong tin nhan vien can sua:");
        nvTemp1.nhapThongTin();
        listNhanViens.set(index, nvTemp1);


        //remove
        int index1;
        System.out.println("Nhap vi tri thong tin can xoa:");
        index1 = sc.nextInt();
        System.out.println("Nhap thong tin nhan vien can xoa:");
        listNhanViens.remove(index1);

        //In ds sau khi sua
        System.out.println("Danh sach nhan vien sau khi thay doi: ");
            for(int i = 0; i < listNhanViens.size(); i++){
                System.out.println("Nhan vien thu " + (i + 1));
                System.out.println("________________");
                System.out.println("Ma nhan vien: " + listNhanViens.get(i).maNV);
                System.out.println("Ten nhan vien: " + listNhanViens.get(i).tenNV);
                System.out.println("Dia chi nhan vien: " + listNhanViens.get(i).diaChi);
            }

            //Tim kiem theo ten nhan vien
            System.out.println("Nhap ten nhan vien can tim kiem");
            String temp;
            temp = sc.nextLine();
            System.out.println("Danh sach nhan vien co ten: " + temp);
            for(int i = 0; i < listNhanViens.size(); i++){
                if(listNhanViens.get(i).tenNV == temp){
                    System.out.println("Ma nhan vien: " + listNhanViens.get(i).maNV);
                    System.out.println("Ten nhan vien: " + listNhanViens.get(i).tenNV);
                    System.out.println("Dia chi nhan vien: " + listNhanViens.get(i).diaChi);
                }
            }
    }
}

//2021050800