import java.util.Scanner;
public class App9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String chuoi = new String();
        System.out.println("Nhap chuoi ky tu: ");
        chuoi = sc.nextLine();
        int dem1, dem2, dem3;
        dem1 = 0;
        dem2 = 0;
        dem3 = 0;
        for(int i = 0; i < chuoi.length(); i++){
            if( chuoi.charAt(i) >= 'a' && chuoi.charAt(i) <= 'z')
                dem1++;
            else if(chuoi.charAt(i) >= 'A' && chuoi.charAt(i) <= 'Z')
                dem2++;
            else if(chuoi.charAt(i) != ' ')
                dem3++;
        }
        System.out.println("Co "+ dem1 +" chu thuong trong chuoi.");
        System.out.println("Co "+ dem2 +" chu in hoa trong chuoi.");
        System.out.println("Co "+ dem3 +" chu so trong chuoi.");
    }
}
