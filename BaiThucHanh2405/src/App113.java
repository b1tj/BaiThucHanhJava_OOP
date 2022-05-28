import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class App113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> traiCayList = new HashSet<>();
        System.out.println("Nhap danh sach trai cay:");
        while(true){
            System.out.print("Nhap ten trai cay: ");
            String tenTraiCay;
            tenTraiCay = sc.nextLine();
            System.out.println();
            if(tenTraiCay.isEmpty()){
                break;
            }
            traiCayList.add(tenTraiCay);
        }

        System.out.print("So phan tu trong hashSet: " + traiCayList.size());
        System.out.println();
        System.out.println("Phan tu trong hashSet:");
        System.out.println(traiCayList);

        String name;
        System.out.print("Nhap ten trai cay can tim: ");
        name = sc.nextLine();
        if(traiCayList.contains(name)){
            System.out.println("Tim thay " + name + " trong hashSet");
        }else{
            System.out.println("khong tim thay " + name + " trong hashSet");
        }
        
        traiCayList.remove(randomTraiCay(traiCayList));

        System.out.println("Cac phan tu con lai sau khi randRemove");
        System.out.println(traiCayList);

        //Tao List moi
        LinkedList<String> newTraiCayList = new LinkedList<>();
        newTraiCayList.add("dua hau");
        newTraiCayList.add("quyt");
        for(int i = 0; i < newTraiCayList.size(); i++){
            traiCayList.add(newTraiCayList.get(i));
        }
        System.out.println("Cac phan tu trong list");
        for(int i = 0; i < newTraiCayList.size(); i++){
            System.out.println(newTraiCayList.get(i) + " ");
        }

        //Hien thi hashSet su dung iterator
        Iterator<String> iter = traiCayList.iterator();
        System.out.println("Phan tu trong hashSet sau khi them");
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //Xoa cac phan tu cua list co trong hashSet
        for(int i = 0; i < newTraiCayList.size(); i++){
            while(iter.hasNext()){
                if(iter.next() == newTraiCayList.get(i)){
                    newTraiCayList.remove(i);
                }
            }
        }
        //Hien thi lai hashSet
        System.out.println("Phan tu trong hashSet");
        System.out.println(traiCayList);



    }
    public static String randomTraiCay(HashSet<String> hs){
        int randomNum = new Random().nextInt(hs.size());
        int currentIndex = 0;
        String randomElement = null;
        Iterator<String> itr = hs.iterator();
        while(itr.hasNext()){
            randomElement = itr.next();
            if(currentIndex == randomNum){
                return randomElement;
            }
            currentIndex++;
        }
        return randomElement;
    }
}
