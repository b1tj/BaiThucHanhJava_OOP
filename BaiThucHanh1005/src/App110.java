import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App110 {
    public static void main(String[] args) throws Exception{
         ArrayList<Integer> list = new ArrayList<>();
         int n;
         int x;

        Scanner sc = new Scanner(System.in);
         System.out.println("Nhap so phan tu:");
         n = sc.nextInt();
         System.out.println("Nhap day so: ");
         for(int i = 0; i < n; i++){
             x = sc.nextInt();
             list.add(x);
         }

         int max = list.get(0);
         for(int i = 0; i < list.size(); i++){
             if(list.get(i).compareTo(max) > 0)
                max = list.get(i);
         }

         System.out.println("Nhap 1 gia tri nguyen can xoa:");
         int number;
         number = sc.nextInt();
         for(int i = 0; i < list.size(); i++){
             if(list.get(i) == number)
             list.remove(i);
         }

        list.sort(Comparator.naturalOrder());
        System.out.println("Danh sach sau khi sap xep.");
        System.out.println(list);

    }
}

//2021050800
