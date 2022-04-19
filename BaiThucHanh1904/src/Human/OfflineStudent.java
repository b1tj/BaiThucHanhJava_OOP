package Human;

import java.util.Scanner;

public class OfflineStudent extends Student{
    public int diemThiOff;
    
    public OfflineStudent(){

    }
    
    public void nhapDiemThi(){
        System.out.println("Diem thi = " + diemThiOff);
        Scanner sc = new Scanner(System.in);
        diemThiOff = sc.nextInt();
    }

    public void inDiemThi(){
        System.out.println("Diem thi: " + diemThiOff);
    }
}
