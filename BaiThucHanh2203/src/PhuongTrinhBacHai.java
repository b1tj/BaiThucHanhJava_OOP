import java.util.Scanner;
import java.lang.Math;
public class PhuongTrinhBacHai {
    double a, b, c;
    double x1, x2;
    double delta;
    void nhapHeSo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a, b, c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
    }
    void giaiPT(){
        delta = b*b - 4*a*c;
        x1 = (-b+Math.sqrt(delta))/(2*a);
        x2 = (-b-Math.sqrt(delta))/(2*a);
    }
    void inKQ(){
        System.out.print("Nghiem pt: " + x1 + " " + x2);
    }
}
