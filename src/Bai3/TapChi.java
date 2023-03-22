package Bai3;

public class TapChi extends TaiLieu {
    private String maTapChi;
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String maTaiLieu, String tenNhaXuatBan, String tenTaiLieu, double gia, String maTapChi, int soPhatHanh, int thangPhatHanh) {
        super(maTaiLieu, tenNhaXuatBan, tenTaiLieu, gia);
        this.maTapChi = maTapChi;
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getMaTapChi() {
        return maTapChi;
    }

    public void setMaTapChi(String maTapChi) {
        this.maTapChi = maTapChi;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public double dongPhi() {
        if (soPhatHanh % 2 == 0) {
            return gia * 0.9;
        }
        return gia;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "maTapChi='" + maTapChi + '\'' +
                ", soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
