import java.util.Scanner;

public class App90 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String chuoiKytu;
        char Kytu;
        System.out.println("Nhap chuoi ky tu: ");
        chuoiKytu = sc.nextLine();
        System.out.println("Chuoi ky tu vua nhap: " + chuoiKytu);
        for(int i = 0; i < chuoiKytu.length(); i++){
            Kytu = chuoiKytu.charAt(i);
            System.out.println(Kytu);
        }
    }
}
