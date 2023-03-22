package Bai2;

public class Xe {
    private String bienSo;
    private String mauXe;
    private int soChoNgoi;

    public Xe(String bienSo, String mauXe, int soChoNgoi) {
        this.bienSo = bienSo;
        this.mauXe = mauXe;
        this.soChoNgoi = soChoNgoi;
    }

    public String getBienSo() {
        return bienSo;
    }

    public String getMauXe() {
        return mauXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }
    // Phương thức tính tiền đóng
    public double dongPhi() {
        double donGia = 0;
        double phi = 0;

        // Xác định đơn giá
        // Đối với xe hơi, đơn giá là 5000 đồng/1 chỗ ngồi
        // Đối với xe buýt, đơn giá là 1000 đồng/1 chỗ ngồi
        if (this instanceof XeHoi) {
            donGia = 5000;
        } else if (this instanceof XeBus) {
            donGia = 1000;
        }

        // Tính tiền phí đóng
        phi = this.soChoNgoi * donGia;

        return phi;
    }
}
