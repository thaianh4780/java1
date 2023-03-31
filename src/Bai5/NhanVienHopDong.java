package Bai5;

public class NhanVienHopDong extends NhanVien {

    private double mucLuongCoBan;
    private int soNgayCong;
    private int gioTangCa;


    public NhanVienHopDong(String maSo, String hoTen, double mucLuongCoBan, int soNgayCong, int gioTangCa) {
        super(maSo, hoTen);
        this.mucLuongCoBan = mucLuongCoBan;
        this.soNgayCong = soNgayCong;
        this.gioTangCa = gioTangCa;
    }

    public double getMucLuongCoBan() {
        return mucLuongCoBan;
    }

    public void setMucLuongCoBan(double mucLuongCoBan) {
        this.mucLuongCoBan = mucLuongCoBan;
    }

    public int getSoNgayCong() {
        return soNgayCong;
    }

    public void setSoNgayCong(int soNgayCong) {
        this.soNgayCong = soNgayCong;
    }

    public int getGioTangCa() {
        return gioTangCa;
    }

    public void setGioTangCa(int gioTangCa) {
        this.gioTangCa = gioTangCa;
    }

    @Override
    public String toString() {
        return "NhanVienHopDong{" +
                "mucLuongCoBan=" + mucLuongCoBan +
                ", soNgayCong=" + soNgayCong +
                ", gioTangCa=" + gioTangCa +
                '}';
    }

    @Override
    public double tinhLuong() {
        double luong = mucLuongCoBan * soNgayCong / 30;
        if (gioTangCa > 0) {
            luong += gioTangCa * 60000;
        }
        return luong;
    }

}
