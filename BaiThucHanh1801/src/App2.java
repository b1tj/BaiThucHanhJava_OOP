import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double A1, B1, C1;
        double A2, B2, C2;
        System.out.println("Nhap he so A1: ");
        A1 = sc.nextDouble();
        System.out.println("Nhap he so B1: ");
        B1 = sc.nextDouble();
        System.out.println("Nhap he so C1: ");
        C1 = sc.nextDouble();
        System.out.println("Nhap he so A2: ");
        A2 = sc.nextDouble();
        System.out.println("Nhap he so B2: ");
        B2 = sc.nextDouble();
        System.out.println("Nhap he so C2: ");
        C2 = sc.nextDouble();
        double Dx, Dy, D;
        double x, y;
        D = A1*B2 - A2*B1;
        Dx = C1*B2 - B1*C2;
        Dy = A1*C2 - A2*C1;
        if(D == 0){
            if(Dx == Dy){
                System.out.printf("Phuong trinh co vo so nghiem.");
            } else {
                System.out.printf("Phuong trinh vo nghiem.");
            }
        } else {
            x = Dx/D;
            y = Dy/D;
            System.out.printf("Phuong trinh co nghiem x = %f, y = %f.", x, y);
        }
        
    }

}
