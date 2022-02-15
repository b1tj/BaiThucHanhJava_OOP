import java.util.Scanner;

public class App35 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float num1, num2;
        System.out.print("Nhap so thu nhat: ");
        num1 = sc.nextFloat();
        System.out.print("Nhap so thu hai: ");
        num2 = sc.nextFloat();
        if(num1 < num2){
            System.out.println("So lon nhat la: " + num2);
        } else if(num1 > num2) {
            System.out.println("So lon nhat la: " + num1);
        } else {
            System.out.println("Hai so bang nhau.");
        }
    }
}