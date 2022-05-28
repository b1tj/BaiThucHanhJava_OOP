package COLLECTIONS.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class App19 {
    public static void main(String[] args) {
        ArrayList<Character> arrayListChar = new ArrayList<>();

        arrayListChar.add('a');
        arrayListChar.add('b');
        arrayListChar.add('n');
        arrayListChar.add('e');
        arrayListChar.add('h');

        ListIterator<Character> listIterator = arrayListChar.listIterator();

        System.out.println("Cac phan tu co trong arrListChar: ");
        while(listIterator.hasNext()){
            System.out.println(listIterator.next() + "\t");
        }
    }
}
