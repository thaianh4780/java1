package Bai1;

public class Oto extends Xe{

    private int soCho ;
    private int trongTai;

    public Oto(String nhanHieu, double gia, int namSanXuat, int soCho, int trongTai) {
        super(nhanHieu, gia, namSanXuat);
        this.soCho = soCho;
        this.trongTai = trongTai;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "oTo{" +
                "soCho=" + soCho +
                ", trongTai=" + trongTai +
                '}';
    }
}
