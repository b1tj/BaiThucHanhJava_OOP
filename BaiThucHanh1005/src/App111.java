import java.util.LinkedList;
import java.util.Scanner;

public class App111 {
    public static void main(String[] args) throws Exception{
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int n;
        int x;
        n = sc.nextInt();
        System.out.println("Nhap day so: ");
         for(int i = 0; i < n; i++){
             x = sc.nextInt();
             list.add(x);
         }

         int sum = 0;
         int count = 0;
         for(int i = 0; i < list.size(); i++){
             if(list.get(i) % 2 == 0){
                 sum += list.get(i);
                 count++;
             }    
         }
         System.out.println("Trung binh cong phan tu chan trong danh sach vua nhap" + (sum*1.0/count));
    }
}

//2021050800
