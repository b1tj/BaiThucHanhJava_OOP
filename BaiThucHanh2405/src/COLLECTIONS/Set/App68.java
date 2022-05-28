package COLLECTIONS.Set;

import java.util.Scanner;
import java.util.TreeSet;

public class App68 {
    public static void main(String[] args) {
        int number;
        TreeSet<Integer> treeSetiInteger = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        treeSetiInteger.add(1);
        treeSetiInteger.add(3);
        treeSetiInteger.add(5);
        treeSetiInteger.add(2);
        treeSetiInteger.add(7);
        treeSetiInteger.add(4);

        System.out.println("Cac phan tu trong treeSetInteger:");
        System.out.println(treeSetiInteger);
        System.out.println("Nhap phan tu can them: ");
        number = sc.nextInt();

        if(!treeSetiInteger.contains(number)){
            treeSetiInteger.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("Cac phan tu trong treeSetInteger sau khi them: ");
            System.out.println(treeSetiInteger);

        } else {
            System.out.println("Phan tu " + number + " da ton tai!");
        }
        
    }
}
