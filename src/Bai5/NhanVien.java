package Bai5;

public class NhanVien {
    private String maSo;
    private String hoTen;

    public NhanVien(String maSo, String hoTen) {
        this.maSo = maSo;
        this.hoTen = hoTen;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double tinhLuong() {
        return 0;
    }
}