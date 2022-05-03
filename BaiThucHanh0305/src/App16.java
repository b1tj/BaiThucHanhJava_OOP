import java.util.ArrayList;

public class App16 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        arrList.add("E");

        System.out.println("arrList vua nhap:");
        for(int i = 0; i < arrList.size(); i++)
        {
            System.out.print(arrList.get(i) + "\t");
        }

        arrList.set(4, "J");
        System.out.println();
        System.out.println("arrList sau khi sua:");
        for(int i = 0; i < arrList.size(); i++)
        {
            System.out.print(arrList.get(i) + "\t");
        }      
    }
}
