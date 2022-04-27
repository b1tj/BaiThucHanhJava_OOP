package shape;

import java.util.Scanner;

public class Point{
    protected String tenDiem;
    protected float hoanhDo;
    protected float tungDo;

    public Point(String tenDiem, float hoanhDo, float tungDo){
        this.tenDiem = tenDiem;
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public Point(){

    }

    public float getHoanhDo(){
        return hoanhDo;
    }

    public float getTungDo(){
        return tungDo;
    }

    public void setHoanhDo(float hoanhDo){
        this.hoanhDo = hoanhDo;
    }

    public void setTungDo(float tungDo){
        this.tungDo = tungDo;
    }

    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten diem: ");
        tenDiem = sc.nextLine();
        System.out.println("Nhap hoanh do: ");
        hoanhDo = sc.nextFloat();
        System.out.println("Nhap tung do: ");
        tungDo = sc.nextFloat();
    }

    public void inDiem(){
        System.out.println(tenDiem + "(" + hoanhDo +"," + tungDo + ")");
    }

}