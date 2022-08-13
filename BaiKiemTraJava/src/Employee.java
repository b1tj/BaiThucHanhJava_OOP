import java.util.Scanner;
import java.util.ArrayList;
public class Employee extends Person{
    public String employeeID;
    public float employeeSalary;
    public int employeeAge;

    @Override
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.print("nhap ma nhan vien: ");
        employeeID = sc.nextLine();
        System.out.print("nhap luong: ");
        employeeSalary = sc.nextFloat();
        System.out.print("nhap tuoi: ");
        employeeAge = sc.nextInt();
    }

    @Override
    public void inThongTin(){
        super.inThongTin();
        System.out.println("id nhan vien: " + employeeID);
        System.out.println("luong nhan vien: " + employeeSalary);
        System.out.println("tuoi nhan vien: " + employeeAge);
    }

    public void inThongTinNhanVien(Employee data){
        data.inThongTin();
    }

    public static void themThongTin(ArrayList<Employee> list){
        int n;
        Scanner sc = new  Scanner(System.in);
        System.out.print("nhap n:");
        n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){
            Employee employ = new Employee();
            System.out.println("nhap thong tin nhan vien thu " + (i + 1)+" :");
            employ.nhapThongTin();
            list.add(employ);
        }
    }

    public static void inDanhSach(ArrayList<Employee> list){
        for(int i = 0; i < list.size(); i++){
            System.out.println("thong tin nhan vien thu " +(i+1)+ " :");
            list.get(i).inThongTin();
        }
    }
}
