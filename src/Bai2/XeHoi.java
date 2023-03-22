package Bai2;

public class XeHoi extends Xe {
    private String hangXe;

    public XeHoi(String bienSo, String mauXe, int soChoNgoi, String hangXe) {
        super(bienSo, mauXe, soChoNgoi);
        this.hangXe = hangXe;
    }

    public String getHangXe() {
        return hangXe;
    }


    public double dongPhi() {
        double phi = getSoChoNgoi() * 5000;
        if (getSoChoNgoi() > 30) {
            phi *= 0.8; // Giảm 20%
        }
        return phi;
    }
}