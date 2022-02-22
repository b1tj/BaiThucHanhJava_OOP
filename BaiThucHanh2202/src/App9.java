import java.util.Scanner;
public class App9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        while(n != 0)
        {
            int temp;
            temp = n%10;
            System.out.print(temp);
            n = n/10;
        }
    }
}
