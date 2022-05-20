import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class App106 {
    public static void main(String[] args){
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            System.out.println("Nhap key:");
            int x1 = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap ky tu: ");
            char x2 = sc.next().charAt(0);
            treeMap.put(x1,x2);
        }

        Set<Map.Entry<Integer, Character>> setTreeMap = treeMap.entrySet();

        System.out.println("Cac entry co trong setTreeMap:");
        System.out.println(setTreeMap);
    }
}
