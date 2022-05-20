import java.util.HashSet;
import java.util.Scanner;

public class App54 {
    public static void main(String[] args) throws Exception {
       int n;
       System.out.println("Nhap n:");
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();

       int x;
       HashSet<Integer> hashSetIntegers = new HashSet<>();
       for(int i = 0; i < n; i++){
           System.out.print("Nhap so can them: ");
            x = sc.nextInt();
            if(!hashSetIntegers.contains(x)){
                hashSetIntegers.add(x);
            } else {
                System.out.println(x + " da ton tai.");
            }
            System.out.println();
       }

       System.out.println("Phan tu trong hashset:");
       System.out.println(hashSetIntegers); 

       int number;
       System.out.println("Nhap phan tu can them:");
       number = sc.nextInt();
       if(!hashSetIntegers.contains(number)){
           hashSetIntegers.add(number);
           System.out.println("Them thanh cong!");
           System.out.println("HashSet sau khi them: ");
           System.out.println(hashSetIntegers);
       } else {
           System.out.println("Phan tu " + number + " da ton tai.");
       }
       
    }
}
