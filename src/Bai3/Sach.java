package Bai3;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String tenNhaXuatBan, String tenTaiLieu, double gia, String tenTacGia, int soTrang) {
        super(maTaiLieu, tenNhaXuatBan, tenTaiLieu, gia);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public double dongPhi() {
        double phi = gia;
        if (tenTacGia.equals("ABC")) {
            phi *= 0.95; // giảm giá 5% cho sách của tác giả ABC
        }
        return phi;
    }
}
