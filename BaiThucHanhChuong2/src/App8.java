import java.util.Scanner;
public class App8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        int n1, sum = 0;
        for(int i = 0; i < n; i++)
        {
            n1 = sc.nextInt();
            sum += n1;
        }
        System.out.println("Trung binh cong cua cac so vua nhap la: "+ (double)sum/n);
    }
}
