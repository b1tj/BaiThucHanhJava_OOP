import java.util.ArrayList;
import java.util.ListIterator;

public class App19 {
    public static void main(String[] args) throws Exception {
        ArrayList<Character> arrayListChar = new ArrayList<>();

        arrayListChar.add('a');
        arrayListChar.add('b');
        arrayListChar.add('g');
        arrayListChar.add('f');

        ListIterator<Character> listIterator = arrayListChar.listIterator();
        System.out.println("arrList vua nhap:");

        while(listIterator.hasNext()){
            System.out.print(listIterator.next() + "\t");
        }
    }
}
