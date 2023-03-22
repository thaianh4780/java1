package Bai2;

public class XeBus extends Xe {
    private String tuyenXe;

    public XeBus(String bienSo, String mauXe, int soChoNgoi, String tuyenXe) {
        super(bienSo, mauXe, soChoNgoi);
        this.tuyenXe = tuyenXe;
    }

    public String getTuyenXe() {
        return tuyenXe;
    }

    public double dongPhi() {
        return getSoChoNgoi() * 1000;
    }
}