import java.util.Scanner;

public class App40 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int ngay;
        System.out.print("Nhap ngay: ");
        ngay = sc.nextInt();
        switch(ngay){
            case 2: System.out.println("Thu Hai."); break;
            case 3: System.out.println("Thu Ba."); break;
            case 4: System.out.println("Thu Tu."); break;
            case 5: System.out.println("Thu Nam."); break;
            case 6: System.out.println("Thu Sau."); break;
            case 7: System.out.println("Thu Bay."); break;
            case 8: System.out.println("Chu Nhat."); break;
            default: System.out.println("Ngay khong hop le.");
        }
    }
}