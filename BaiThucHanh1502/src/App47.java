import java.util.Scanner;

public class App47 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        do{
            System.out.print("Nhap vao so nguyen bat ky: ");
            n = sc.nextInt();
            sum += n;
        } while(n < 100);
        System.out.print("Tong cac so nguyen vua nhap: " +sum);
    }
}