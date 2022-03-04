import java.util.Scanner;
public class App10 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String kyTu = new String();
        String chuoi = new String();
        int dem = 0;

        do{
            System.out.println("Nhap chuoi ky tu: ");
            chuoi = sc.nextLine();
        } while(chuoi.length() > 80);
        do{
            System.out.println("Nhap 1 ky tu can dem: ");
            kyTu = sc.nextLine();
        } while(kyTu.length() > 1);
        for(int i = 0; i < chuoi.length(); i++){
            if(chuoi.charAt(i) == kyTu.charAt(0))
                dem++;
        }
        System.out.println(kyTu +" xuat hien " +dem+ " lan.");
    }
}
