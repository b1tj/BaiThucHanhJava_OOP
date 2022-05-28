package COLLECTIONS.List;

import java.util.ArrayList;

public class App21 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Green");
        colors.add("White");
        colors.add("Gray");
        colors.add("Black");

        System.out.println(colors.get(2));
        System.out.println(colors.contains("Orange"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
