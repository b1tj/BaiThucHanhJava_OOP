package App72;

public class SinhVien {
    private String tuoi;
    private String ten;

    public String getTen(){
        return ten;
    }

    public void setTen(String ten) {
        if(ten == null || ten.isEmpty()){
            this.ten = "Khong ton tai";
        } else {
            this.ten = ten;
        }
    }

    public String getTuoi(){
        if(Integer.valueOf(tuoi) != -1){
            return tuoi;
        } else {
            return "Tuoi khong hop le.";
        }
    }

    public void setTuoi(int tuoi){
        if(tuoi > 18){
            this.tuoi = String.valueOf(tuoi);
        } else {
            this.tuoi = String.valueOf(-1);
        }
    }
}
