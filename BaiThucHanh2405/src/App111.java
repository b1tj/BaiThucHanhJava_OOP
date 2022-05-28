import java.util.LinkedList;
import java.util.Scanner;

public class App111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        System.out.println("Nhap day so nguyen duong: ");
        for(int i = 0; i < n; i++){
            int x;
            x = sc.nextInt();
            linkedList.add(x);
        }
        int sum = 0;
        int count = 0;
        for(int i = 0; i < linkedList.size(); i++){
            if(linkedList.get(i)%2 == 0){
                sum += linkedList.get(i);
                count++;
            }
        }
        System.out.println("Trung binh cong phan tu chan cua day so = " + (sum*1.0/count));
    }
}
