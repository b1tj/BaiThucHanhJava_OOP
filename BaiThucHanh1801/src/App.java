import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double HeSoA, HeSoB, HeSoC, delta;
        System.out.println("Nhap He so A: ");
        HeSoA = sc.nextDouble();
        System.out.println("Nhap He so B: ");
        HeSoB = sc.nextDouble();
        System.out.println("Nhap He so C: ");
        HeSoC = sc.nextDouble();
        delta = HeSoB*HeSoB - 4*HeSoA*HeSoC;
        double x1, x2;
        if(delta > 0){
            x1 = (-HeSoB - Math.sqrt(delta))/(2*HeSoA);
            x2 = (-HeSoB + Math.sqrt(delta))/(2*HeSoA);
            System.out.printf("Phuong trinh co nghiem x1 = %f, x2 = %f", x1, x2);
        } else if(delta == 0){
            x1 = (-HeSoB)/(2*HeSoA);
            x2 = x1;
            System.out.printf("Phuong trinh co nghiem x1 = x2 = %f", x1);
        } else if (delta < 0){
            System.out.println("Phuong trinh vo nghiem !");
        }

    }
}
