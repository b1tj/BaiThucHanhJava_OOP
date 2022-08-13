import java.util.Scanner;

public class Person{
    public String PersonID;
    public String PersonName;
    public String PersonAddress;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap id: ");
        PersonID = sc.nextLine();
        System.out.print("nhap ten: ");
        PersonName = sc.nextLine();
        System.out.print("nhap dia chi:");
        PersonAddress = sc.nextLine(); 
    }

    public void inThongTin(){
        System.out.println("id: " + PersonID);
        System.out.println("ten: " + PersonName);
        System.out.println("dia chi: " + PersonAddress);
    }
}