import java.util.ArrayList;
import java.util.Scanner;

public class App22 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number;

        System.out.println("Nhap so phan tu cua arrList: ");
        int n;
        n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + i + ":");
            number = sc.nextInt();
            arrListInteger.add(number);
        }

        int max = arrListInteger.get(0);

        for(int i = 0; i < arrListInteger.size(); i++){
            if(arrListInteger.get(i).compareTo(max) > 0){
                max = arrListInteger.get(i);
            }
        }

        System.out.println("Phan tu lon nhat trong arrList: " + max);
    }
}
