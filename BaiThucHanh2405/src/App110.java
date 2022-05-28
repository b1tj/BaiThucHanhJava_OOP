import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class App110 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n;
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Nhap so phan tu arrList: ");
        n = sc.nextInt();
        System.out.println("Nhap day so nguyen: ");
        for(int i = 0; i < n; i++){
            int x;
            x = sc.nextInt();
            arrayList.add(x);
        }
        System.out.println("Phan tu trong arrList: ");
        for(int i : arrayList){
            System.out.println(i + " ");
        }

        int max = arrayList.get(0);
        for(int i = 0; i < n; i++){
            if(max < arrayList.get(i)){
                max = arrayList.get(i);
            }
        }

        System.out.println("Phan tu max trong arrList: " + max);
        int number;
        System.out.println("Nhap gia tri can xoa: ");
        number = sc.nextInt();
        for(int i = 0; i < arrayList.size(); i++){
            if(arrayList.get(i) == number){
                arrayList.remove(i);
            }
        }

        System.out.println("arrList sau khi remove: ");
        for(int i : arrayList){
            System.out.println(i + " ");
        }

        arrayList.sort(Comparator.naturalOrder());
        System.out.println("arrList sau khi sort:");
        for(int i : arrayList){
            System.out.println(i + " ");
        }

        
    }
}
