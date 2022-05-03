import java.util.ArrayList;

public class App21 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Gray");

        System.out.println(colors.get(0));
        System.out.println(colors.contains("Gray"));
        System.out.println(colors.size());
        System.out.println(colors);
        System.out.println(colors.indexOf("Yellow"));
    }
}
