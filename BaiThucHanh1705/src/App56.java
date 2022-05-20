import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n:");
        n = sc.nextInt();
        
        String name;
        String x;
        HashSet<String> hashSetStrings = new HashSet<String>();
        for(int i = 0 ; i < n; i++){
            System.out.print("Nhap ten: ");
            x = sc.nextLine();
            if(!hashSetStrings.contains(x)){
                hashSetStrings.add(x);
            } else {
                System.out.println("Ten " + x + "da ton tai.");
            }
            System.out.println();
        }

        System.out.println("Phan tu trong hashsetStrings:");
        System.out.println(hashSetStrings); 
        System.out.println("Nhap phan tu can xoa:");
        name = sc.nextLine();
        if(hashSetStrings.contains(name)){
            hashSetStrings.remove(name);
            System.out.println("Xoa thanh cong!");
            System.out.println("HashSet sau khi xoa: ");
            System.out.println(hashSetStrings);
        } else {
            System.out.println("Xoa khong thanh cong!");
        }
    }   
}
