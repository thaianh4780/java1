package Bai5;

public class NhanVienThoiVu extends NhanVien{
    private int soGioLam;

    public NhanVienThoiVu(String maSo, String hoTen, int soGioLam) {
        super(maSo, hoTen);
        this.soGioLam = soGioLam;
    }

    public int getSoGioLam() {
        return soGioLam;
    }

    public void setSoGioLam(int soGioLam) {
        this.soGioLam = soGioLam;
    }

    public double tinhLuong(){
        double luong = soGioLam*50_000;
        return luong;
    }
}
