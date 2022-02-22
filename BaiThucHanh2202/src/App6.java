import java.util.Scanner;
public class App6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sum, n;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        while(n > 1)
        {
            sum = 0;
            for(int i = 1; i <= n/2; i++)
            {
                if(n % i == 0)
                    sum += i;
            }
            if(sum == n){
                System.out.print(n+ " ");
            }
            n--;
        }
    }
}
