import java.util.Scanner;

public class Person {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;

    void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        PersonID = sc.nextLine();
        System.out.print("Nhap ten: ");
        PersonName = sc.nextLine();
        System.out.print("Nhap dia chi:");
        Address = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        Gender = sc.nextBoolean();
    }
    void inThongTin(){
        System.out.println("ID: " + PersonID);
        System.out.print("Ten: " + PersonName);
        System.out.print("Dia chi: " + Address);
        if(Gender == true){
            System.out.print("Gioi tinh: Nam");
        }
        else{
            System.out.print("Gioi tinh: Nu");
        }
    }
}
