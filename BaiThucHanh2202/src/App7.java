import java.util.Scanner;
public class App7 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a;
        double max = 0;
        System.out.println("Nhap day so:");
        do
        {
            a = sc.nextDouble();
            if(a > max)
                max = a;

        } while(a != 0);
        System.out.print("So lon nhat vua nhap: "+ max);
        
    }
}
