package Bai5;

public class ThiSinh {
    private String soBaoDanh;
    private String hoTen;
    private double diemMon1;
    private double diemMon2;
    private double diemMon3;

    public ThiSinh(String soBaoDanh, String hoTen, double diemMon1, double diemMon2, double diemMon3) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diemMon1 = diemMon1;
        this.diemMon2 = diemMon2;
        this.diemMon3 = diemMon3;
    }

    public double tinhTongDiem() {
        return diemMon1 + diemMon2 + diemMon3;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemMon1() {
        return diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public double getDiemMon3() {
        return diemMon3;
    }
}