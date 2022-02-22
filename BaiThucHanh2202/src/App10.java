import java.util.Scanner;
public class App10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        int cnt = 0;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        while(n != 0)
        {
            n = n/10;
            cnt++;
        }
        System.out.print("So vua nhap co "+cnt+" chu so.");
    }
}