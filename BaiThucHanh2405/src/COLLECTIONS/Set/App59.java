package COLLECTIONS.Set;

import java.util.LinkedHashSet;
import java.util.Random;

public class App59 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();

        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Python");
        linkedHashSet.add("PHP");

        //Xoa ngau nhien 1 phan tu trong linkedHashSet
        linkedHashSet.remove(random(linkedHashSet));
        System.out.println("linkedHashSet sau khi remove:");
        System.out.println(linkedHashSet);

    }
    public static String random(LinkedHashSet<String> linkedHashSet){
        String name;
        String[] arr = new String[linkedHashSet.size()];
        linkedHashSet.toArray(arr);
        int randomNum = new Random().nextInt(linkedHashSet.size()-1);
        name = arr[randomNum];
        return name;
    }
}
