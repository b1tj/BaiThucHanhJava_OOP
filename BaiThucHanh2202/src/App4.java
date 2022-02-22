import java.util.Scanner;
public class App4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, mark;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        while(n > 0)
        {
            mark = 1;
            for(int i = 2; i <= n/2; i++)
            {
                if(n % i == 0){
                    mark = 0;
                }
            }
            if(mark == 1){
                System.out.print(n+" ");
            }   
            n--;
        }
    }
}
