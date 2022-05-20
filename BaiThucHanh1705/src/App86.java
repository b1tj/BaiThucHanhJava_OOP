import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class App86 {
    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            System.out.println("Nhap key:");
            String x1 = sc.nextLine();
            System.out.println("Nhap ten: ");
            String x2 = sc.nextLine();
            hashMap.put(x1,x2);
        }

        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();

        System.out.println("Cac entry co trong setHashMap: ");
        System.out.println(setHashMap);
    }
}
