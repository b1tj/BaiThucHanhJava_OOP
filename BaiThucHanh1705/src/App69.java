import java.util.LinkedHashSet;
import java.util.Scanner;

public class App69 {
    public static void main(String[] args){
        int number;
        LinkedHashSet<Integer> treeSetIntegers = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        treeSetIntegers.add(8);
        treeSetIntegers.add(0);
        treeSetIntegers.add(4);
        treeSetIntegers.add(6);
        treeSetIntegers.add(3);
        treeSetIntegers.add(2);

        System.out.println("Cac phan tu trong treeSetInteger: ");
        System.out.println(treeSetIntegers);
        System.out.println("Nhap phan tu can them:");
        number = sc.nextInt();

        if(!treeSetIntegers.contains(number)){
            treeSetIntegers.add(number);
            System.out.println("Them thanh cong!");
            System.out.println("HashSet sau khi them: ");
            System.out.println(treeSetIntegers);
        } else {
            System.out.println("Phan tu " + number + " da ton tai.");
        }

    }
}
