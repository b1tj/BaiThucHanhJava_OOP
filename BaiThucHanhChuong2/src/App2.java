import java.util.Scanner;
public class App2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so: ");
        n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println(n+ " la so chan.");
        } else {
            System.out.println(n+ " la so le.");
        }  
    }
}
