package Human;

public class VIPCustomer extends Customer{
    private static final float giamGia = 0.05f;

    public VIPCustomer(){

    }

    @Override
    public void inThongTin(){
        System.out.println("Ten: " + ten);
        System.out.println("So dien thoai: " + soDienThoai);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Tong gia tri don hang: " + tongGiaTriDonHang * (1-giamGia));
    }
}
