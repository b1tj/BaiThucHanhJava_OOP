import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class App94 {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            System.out.println("Nhap key:");
            int x1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap ten: ");
            String x2 = sc.nextLine();
            hm.put(x1,x2);
        }
        
        for(Map.Entry<Integer, String> m : hm.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());

        System.out.println("Truoc khi remove: " + hm);
        hm.remove(101);
        System.out.println("Sau khi remove: " + hm);
    }
}
