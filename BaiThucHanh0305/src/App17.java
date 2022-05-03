import java.util.ArrayList;

public class App17 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();

        arrayListInteger.add(3);
        arrayListInteger.add(0);
        arrayListInteger.add(9);
        arrayListInteger.add(5);

        System.out.println("arrList vua nhap: ");
        for(int number : arrayListInteger){
            System.out.print(number + "\t");
        }
    }
}
