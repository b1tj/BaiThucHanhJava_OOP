package COLLECTIONS.List;

import java.util.ArrayList;
import java.util.Scanner;

public class App24 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListiInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu arrList:");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            number = sc.nextInt();
            arrayListiInteger.add(number);
        }

        int max = arrayListiInteger.get(0);

        for(int i = 1; i < arrayListiInteger.size(); i++){
            if(arrayListiInteger.get(i).compareTo(max) > 0){
                max = arrayListiInteger.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong arrListInteger = " + max);
    }
}
