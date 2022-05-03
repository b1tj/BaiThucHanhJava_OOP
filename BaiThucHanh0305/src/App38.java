import java.util.LinkedList;

public class App38 {
    public static void main(String[] args) throws Exception{
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("CSS");

        System.out.println(("Su dung phuong thuc addAll()"));

        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(list);
        System.out.println(listA);

        System.out.println("Su dung phuong thuc retainAll()");

        LinkedList<String> listB = new LinkedList<>();
        listB.add("Java");

        listA.retainAll(listB);
        System.out.println("list A sau khi thuc hien phuong thuc: " + listA);

        System.out.println("Su dung phuong thuc removeAll()");
        list.removeAll(listB);
        System.out.println("list:" + list);
    }
}
