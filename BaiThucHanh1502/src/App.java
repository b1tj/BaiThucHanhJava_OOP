import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so n: ");
        n = sc.nextInt();
        int Sum = 0;
        while(n > 0)
        {
            Sum += n % 10;
            n = n/10;
        }
        System.out.println("Tong cac so cua n: " + Sum);
    }
}
