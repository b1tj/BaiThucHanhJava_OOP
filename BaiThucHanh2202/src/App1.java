import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Nhap vao a, b:");
        a = sc.nextInt();
        b = sc.nextInt();
        while(a != b)
        {
            if(a > b){
                a -= b;
            } else {
                b -=a;
            }
        }
        System.out.print("UCLN cua a va b:" + a);
    }
}
