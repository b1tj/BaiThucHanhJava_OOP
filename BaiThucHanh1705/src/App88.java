import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;

public class App88 {
    public static void main(String[] args){
        HashMap<String, String> hashMapCity = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){
            System.out.println("Nhap key:");
            String x1 = sc.nextLine();
            System.out.println("Nhap ten: ");
            String x2 = sc.nextLine();
            hashMapCity.put(x1,x2);
        }

        System.out.println("Danh sach thanh pho trong hashMapCity: ");
        Set<Map.Entry<String, String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        System.out.println("QNg: " + hashMapCity.get("QNg"));

        System.out.println("Tn: " + hashMapCity.get("Tn"));

        if(hashMapCity.containsValue("Thanh pho Ho Chi Minh")){
            System.out.println("Co thanh pho Ho Chi Minh trong hashMapCity");
        }
    }
}
