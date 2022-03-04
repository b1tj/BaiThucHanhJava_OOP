import java.util.Scanner;
public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        System.out.println("Nhap so:");
        while(sum <= 100){
            n = sc.nextInt();
            sum += n;
        }
        System.out.println("Tong cac so vua nhap: "+ sum);
    }
}
