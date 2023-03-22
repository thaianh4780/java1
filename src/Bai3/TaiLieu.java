package Bai3;

public class TaiLieu {

    protected String maTaiLieu;
    protected String tenNhaXuatBan;
    protected String tenTaiLieu;
    protected double gia;

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, String tenTaiLieu, double gia) {
        this.maTaiLieu = maTaiLieu;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.tenTaiLieu = tenTaiLieu;
        this.gia = gia;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", tenNhaXuatBan='" + tenNhaXuatBan + '\'' +
                ", tenTaiLieu='" + tenTaiLieu + '\'' +
                ", gia=" + gia +
                '}';
    }

    public double dongPhi() {
        return gia;
    }
}
