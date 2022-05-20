import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
public class App95 {
    public static void  main(String[] args){
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            System.out.println("Nhap key:");
            int x1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap ten: ");
            String x2 = sc.nextLine();
            linkedHashMap.put(x1,x2);
        }
        System.out.println("LinkedHashMap truoc khi remove:");
        show(linkedHashMap);
        linkedHashMap.remove(2);

        System.out.println("LinkedHashMap sau khi remove:");
        show(linkedHashMap);
    }
    public static void show(LinkedHashMap<Integer, String> linkedHashMap){
        Set<Integer> keySet = linkedHashMap.keySet();
        for(Integer key : keySet){
            System.out.println(key + " " + linkedHashMap.get(key));
        }
    }
}
