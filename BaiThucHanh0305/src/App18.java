import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[] args) throws Exception {
        ArrayList<Float> arrayListFloat = new ArrayList<>();

        arrayListFloat.add(2.4f);
        arrayListFloat.add(5.02f);
        arrayListFloat.add(6.57f);
        arrayListFloat.add(9.9f);

        Iterator<Float> iterator = arrayListFloat.iterator();
        System.out.println("arrList vua nhap: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
    }
}
