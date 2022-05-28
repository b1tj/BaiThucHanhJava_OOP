package COLLECTIONS.List;

import java.util.ArrayList;
import java.util.Iterator;

public class App18 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloat = new ArrayList<>();

        arrayListFloat.add(5.7f);
        arrayListFloat.add(3.2f);
        arrayListFloat.add(1.1f);

        Iterator<Float> iterator = arrayListFloat.iterator();
        System.out.println("Cac phan tu trong arrListFloat:");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + "\t");
        }
    }
}
