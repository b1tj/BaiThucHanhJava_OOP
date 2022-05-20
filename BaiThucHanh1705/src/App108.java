import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class App108 {
    public static void main(String[] args){
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap key:");
            int x1 = sc.nextInt();
            System.out.println("Nhap gia tri: ");
            Double x2 = sc.nextDouble();
            treeMap.put(x1,x2);
        }
        System.out.println("Cac phan tu co trong treeMap: ");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

        treeMap.replace(1, 2.2d, 5.7d);
        treeMap.replace(2, 10.11d);

        System.out.println("Cac phan tu trong treeMap sau khi thay the: ");
        setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
    }
}
