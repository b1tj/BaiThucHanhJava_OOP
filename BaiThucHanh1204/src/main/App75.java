package main;

import App75.HinhChuNhat;
import App75.HinhHoc;
import App75.HinhTron;

public class App75 {
    public static void main(String[] args) throws Exception {
        HinhHoc hinhHoc = new HinhHoc();
        HinhTron hinhTron1 = new HinhTron();
        HinhTron hinhTron2 = new HinhTron();
        HinhChuNhat hinhChuNhat = new HinhChuNhat();

        System.out.println("Co tat ca " + HinhHoc.dem + " hinh trong ung dung.");
    }
}
