import java.util.LinkedHashSet;
import java.util.Scanner;

public class App60 {
    public static void main(String[] args){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            System.out.println("Nhap ten:");
            String x = sc.nextLine();
            linkedHashSet.add(x);
        }

        System.out.println("Phan tu trong LinkedHashSet:");
        for(String str : linkedHashSet){
            System.out.println(str);
        }
    }
}
