import shape.*;

public class App {
    public static void main(String[] args) throws Exception {
        // Point p1 = new Point("A", 2.2f, 4.5f);
        // p1.inDiem();
        // Point p2 = new Point();
        // p2.nhapDiem();
        // p2.inDiem();
        // Triangle tamGiac = new Triangle();
        // tamGiac.nhapTamGiac();
        // System.out.println(("Ket qua kiem tra: ") + tamGiac.kiemTraLoaiTamGiac());
        Quadrilateral tuGiac = new Quadrilateral();
        tuGiac.nhapTuGiac();
        System.out.println("Ket qua kiem tra: " + tuGiac.kiemTraLoaiTuGiac());

    }
}
