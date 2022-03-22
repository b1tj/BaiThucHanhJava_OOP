
public class App {
    public static void main(String[] args) throws Exception {

        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhapDaiRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();

        Person person = new Person();
        person.nhapThongTin();
        person.inThongTin();

        SinhVien sv = new SinhVien();
        sv.nhapThongTin();
        sv.inThongTin();

        PhuongTrinhBacHai pt = new PhuongTrinhBacHai();
        pt.nhapHeSo();
        pt.giaiPT();
        pt.inKQ();
    }
}


