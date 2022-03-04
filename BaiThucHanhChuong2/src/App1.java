import java.util.Scanner;
public class App1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b;
        System.out.println("Nhap vao 2 so: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Tong 2 so la: "+ (a + b) );
        System.out.println("Hieu 2 so la: "+ (a - b));
        System.out.println("Tich 2 so la: "+ a*b);
        System.out.println("Thuong 2 so la: "+ a/b);
        System.out.println("Phep chia lay du cua 2 so: "+ a%b);
        if(a > b)
            System.out.println(a +" > "+ b);
        else if(a < b)
            System.out.println(a +" < "+ b);
        else
            System.out.println(a +" = "+ b);
    }
}
