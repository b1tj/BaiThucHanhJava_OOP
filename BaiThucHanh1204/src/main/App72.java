package main;
import App72.*;
public class App72 {
    public static void main(String[] args) throws Exception {
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();

        sv1.setTen("");
        sv1.setTuoi(21);

        sv2.setTen("Peter");
        sv2.setTuoi(17);

        System.out.println("Sinh vien 1 co ten: "+sv1.getTen()+", tuoi: "+sv1.getTuoi());
        System.out.println("Sinh vien 2 co ten: "+sv2.getTen()+", tuoi: "+sv2.getTuoi());

    }
}
