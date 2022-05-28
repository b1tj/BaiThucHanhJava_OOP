package COLLECTIONS.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App87 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapCity = new HashMap<>();
        hashMapCity.put("Qng","Quang Ngai");
        hashMapCity.put("QN","Quang Nam");

        hashMapCity.put("QN","Quang Ninh");
        hashMapCity.put("HCM", "Thanh pho Ho Chi Minh");

        System.out.println("Danh sach cac thanh pho trong hashMapCity: ");
        Set<Map.Entry<String,String>> setCity = hashMapCity.entrySet();
        System.out.println(setCity);

        System.out.println("QNg" + hashMapCity.get("Qng"));

        System.out.println("NT" + hashMapCity.get("NT"));

        if(hashMapCity.containsValue("Thanh pho Ho Chi Minh")){
            System.out.println("Co thanh pho Ho Chi Minh trong hashMapCity");
        }
    }   
}
