import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Nhap 3 canh tam giac: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        int vuong = 0;
        if(a*a == (b*b + c*c)){
            vuong = 1;
        } else if(b*b == (a*a + c*c)){
            vuong = 1;
        } else if (c*c == (b*b + c*c)){
            vuong = 1;
        }

        if(a == b && a == c){
            System.out.println("Tam giac da nhap la tam giac deu.");
        } else if ((a == b || a == c || b == c) && vuong == 1){
            System.out.println("Tam giac da nhap la tam giac vuong can.");
        } else if(a == b || a == c || b == c){
            System.out.println("Tam giac da nhap la tam giac can.");
        } else if(vuong == 1){
            System.out.println("Tam giac da nhap la tam giac vuong.");
        } else {
            System.out.println("Tam giac da nhap la tam giac thuong.");
        }
    }
}