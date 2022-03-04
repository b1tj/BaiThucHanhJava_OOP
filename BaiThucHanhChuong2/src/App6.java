import java.util.Scanner;
public class App6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so: ");
        n = sc.nextInt();
        int giaiThua = 1;
        int i = 2;
        do{
            giaiThua *= i;
            i++;
        } while (i <= n);
        System.out.println(n +"! = "+ giaiThua);
    }
}
