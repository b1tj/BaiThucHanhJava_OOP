package shape;

public class Quadrilateral extends Point{
    private float canhA;
    private float canhB;
    private float canhC;
    private float canhD;
    private float temp1_3;
    private float temp2_4;
    private int vuong;

    public void nhapTuGiac(){
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Point p4 = new Point();

        System.out.println("Nhap diem thu nhat: ");
        p1.nhapDiem();
        System.out.println("Nhap diem thu hai: ");
        p2.nhapDiem();
        System.out.println("Nhap diem thu ba: ");
        p3.nhapDiem();
        System.out.println("Nhap diem thu tu: ");
        p4.nhapDiem();

        //Tinh canh tu giac
        canhA = (float)Math.sqrt(Math.pow(p1.hoanhDo-p2.hoanhDo, 2)+Math.pow(p1.tungDo-p2.tungDo, 2));
        canhB = (float)Math.sqrt(Math.pow(p2.hoanhDo-p3.hoanhDo, 2)+Math.pow(p2.tungDo-p3.tungDo, 2));
        canhC = (float)Math.sqrt(Math.pow(p3.hoanhDo-p4.hoanhDo, 2)+Math.pow(p3.tungDo-p4.tungDo, 2));
        canhD = (float)Math.sqrt(Math.pow(p4.hoanhDo-p1.hoanhDo, 2)+Math.pow(p4.tungDo-p1.tungDo, 2));
        temp1_3 = (float)Math.sqrt(Math.pow(p1.hoanhDo-p3.hoanhDo, 2)+Math.pow(p1.tungDo-p3.tungDo, 2));
        temp2_4 = (float)Math.sqrt(Math.pow(p2.hoanhDo-p4.hoanhDo, 2)+Math.pow(p2.tungDo-p4.tungDo, 2));
    }
    //Kiem tra xem co la tu giac khong
    public Boolean kiemTraTuGiac(){
        if(canhA + canhB == temp1_3 || canhB + canhC == temp2_4 || canhC + canhD == temp1_3 || canhA + canhD == temp2_4)
            return false;
        else return true;
    }

    public String kiemTraLoaiTuGiac(){
        vuong = 0;
        if(kiemTraTuGiac() == true){
            //Kiem tra goc vuong
        if(Math.pow(canhA,2)+Math.pow(canhB, 2) == Math.pow(temp1_3, 2))
        vuong++;
        if(Math.pow(canhB,2)+Math.pow(canhC, 2) == Math.pow(temp2_4, 2))
        vuong++;
        if(Math.pow(canhC,2)+Math.pow(canhD, 2) == Math.pow(temp1_3, 2))
        vuong++;
        if(Math.pow(canhA,2)+Math.pow(canhD, 2) == Math.pow(temp2_4, 2))
        vuong++;

    
        if(canhA == canhB && canhC == canhD && canhB == canhC){
            if(vuong >= 1)
                return "Hinh vuong.";
            else
                return "Hinh thoi.";
        } else if(canhA == canhC || canhB == canhD){
            if(vuong >= 1)
                return "Hinh chu nhat.";
            else
                return "Hinh binh hanh.";
        }
        return "Tu giac thuong";
            } else
                return "Khong phai la tu giac";
    }
}
