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

    public double tinhLuong() {
        double luong = (gioTangCa == 0) ? mucLuongCoBan * (soNgayCong / 30) : (mucLuongCoBan * (soNgayCong / 30)) + gioTangCa * 60_000;

        return luong;
    }

}
