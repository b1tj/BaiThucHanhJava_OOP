import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        int i = 2;
        for(; i <= n/2; i++ ){
            if(n % i == 0){
                System.out.println("n khong la so nguyen to.");
                break;
            } else {
                System.out.println("n la so nguyen to.");
                break;
            }
        }
    }
}
