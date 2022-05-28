package COLLECTIONS.List;

import java.util.LinkedList;

public class App38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Java");

        System.out.println("VD phuong thuc addAll()");
        System.out.println("-----------------------");
        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(list);
        System.out.println("ListA:");
        showList(list);

        System.out.println("\nVi du su dung phuong thuc retainAll:");
        System.out.println("-------------------------------");

        LinkedList<String> listB = new LinkedList<>();
        listB.add("Java");
        listA.retainAll(listB);
        System.out.print("ListA: ");
        showList(listA);

        System.out.println("Vi du phuong thuc removeAll()");
        System.out.println("--------------------");
        list.removeAll(listB);
        System.out.print("List: ");
        showList(list);





    }
    public static void showList(LinkedList<String> list){
        for(String str : list){
            System.out.println("\t" + str + ", ");
        }
        System.out.println();
    }
}
