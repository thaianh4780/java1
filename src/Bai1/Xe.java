package Bai1;

public class Xe {
    private String nhanHieu ;
    private double gia ;
    private int namSanXuat;


    public Xe(String nhanHieu, double gia, int namSanXuat) {
        this.nhanHieu = nhanHieu;
        this.gia = gia;
        this.namSanXuat = namSanXuat;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    @Override
    public String toString() {
        return "Xe{" +
                "nhanHieu='" + nhanHieu + '\'' +
                ", gia=" + gia +
                ", namSanXuat=" + namSanXuat +
                '}';
    }
}
