package main;
import App71.*;
public class App71 {
    public static void main(String[] args) throws Exception {
        HinhTron hinhTron = new HinhTron();
        hinhTron.setBanKinh(10);

        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();

        System.out.println("Chu vi hinh tron: " + chuVi + "; Dien tich hinh tron: " + dienTich);

        ToaDo m = new ToaDo();
        m.setX(3);
        m.setY(5);

        System.out.println("Toa do: x = " + m.getX() + " y = "+ m.getY());
    }
}
