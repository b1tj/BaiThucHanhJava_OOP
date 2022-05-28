package COLLECTIONS.Set;

import java.util.HashSet;
import java.util.Scanner;

public class App53{
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSetInteger = new HashSet<>();

        hashSetInteger.add(1);
        hashSetInteger.add(5);
        hashSetInteger.add(7);
        hashSetInteger.add(0);
        hashSetInteger.add(9);
        hashSetInteger.add(2);

        System.out.println("Cac phan tu trong hashSetInteger:");
        System.out.println(hashSetInteger);
        System.out.println("Nhap phan tu them:");
        number = sc.nextInt();

        if(hashSetInteger.contains(number)){
            hashSetInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong hashSetInteger sau khi them: ");
            System.out.println(hashSetInteger);
        } else {
            System.out.println("Phan tu " + number + " da ton tai!");
        }
    }
}