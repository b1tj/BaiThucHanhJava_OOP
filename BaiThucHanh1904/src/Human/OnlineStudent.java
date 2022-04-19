package Human;

import java.util.Scanner;

public class OnlineStudent extends Student{
    public int diemThiOn;

    public OnlineStudent(){

    }
    
    public void nhapDiemThi(){
        System.out.println("Nhap diem thi: ");
        Scanner sc = new Scanner(System.in);
        diemThiOn = sc.nextInt();
    }

    public void inDiemThi(){
        System.out.println("Diem thi: " + diemThiOn);
    }
}
