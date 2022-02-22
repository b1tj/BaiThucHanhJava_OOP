import java.util.Scanner;
public class App5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        for(int i = 1; i <= n/2; i++)
        {
            if(n % i == 0)
                sum += i;
        }
        if(sum == n)   
            System.out.print(n+" la so hoan thien.");
        else 
            System.out.print(n+" khong la so thoan thien.");

    }
}