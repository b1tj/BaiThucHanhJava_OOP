import java.util.Scanner;
public class App3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String Ten = new String();
        Ten = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int Tuoi;
        Tuoi = sc.nextInt();
        if(Tuoi > 0 && Tuoi < 16)
            System.out.println("Ban " +Ten+ " dang o do tuoi vi thanh nien.");
        else if(Tuoi >= 16 && Tuoi < 18)
            System.out.println("Ban " +Ten+ " dang o do tuoi truong thanh.");
        else
            System.out.println("Ban " +Ten+ " da gia.");
    }
}
