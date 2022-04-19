package Human;

import java.util.Scanner;

public class Student extends Person{
    public String maHocSinh;

    public Student(){

    }
    
    public void nhapMaHocSinh(){
        System.out.println("Nhap ma hoc sinh: ");
        Scanner sc = new Scanner(System.in);
        maHocSinh = sc.nextLine();
    }

    public void inMaHocSinh(){
        System.out.println("Ma hoc sinh: " + maHocSinh);
    }
}
