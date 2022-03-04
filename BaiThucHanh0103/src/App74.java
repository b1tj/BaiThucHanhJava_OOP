import java.util.Scanner;

public class App74 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        do
        {
            System.out.println("Nhap so phan tu cua mang: ");
            n= sc.nextInt();
        } while(n<0);
        int a[]= new int[n];
        System.out.println("Nhap vao phan tu cua mang: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print("Phan tu thu "+ i +" cua mang: ");
            a[i] = sc.nextInt();
            System.out.println();
        }

        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sum += a[i];
            }
        }
        System.out.println("Tong cac phan tu chan trong mang = "+ sum);

    }
}
