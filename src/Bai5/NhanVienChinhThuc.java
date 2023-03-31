package Bai5;

public class NhanVienChinhThuc extends NhanVien {
    private double heSoLuong;
    private int gioTangCa;

    public NhanVienChinhThuc(String maSo, String hoTen, double heSoLuong, int gioTangCa) {
        super(maSo, hoTen);
        this.heSoLuong = heSoLuong;
        this.gioTangCa = gioTangCa;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getGioTangCa() {
        return gioTangCa;
    }

    public void setGioTangCa(int gioTangCa) {
        this.gioTangCa = gioTangCa;
    }

    @Override
    public String toString() {
        return "NhanVienChinhThuc{" +
                "heSoLuong=" + heSoLuong +
                ", gioTangCa=" + gioTangCa +
                '}';
    }

    @Override
    public double tinhLuong() {
        double luong = heSoLuong * 1150000;
        if (gioTangCa > 0) {
            luong += gioTangCa * 60000;
        }
        return luong;
    }
}