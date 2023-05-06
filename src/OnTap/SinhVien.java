package OnTap;

import java.io.Serializable;

public class SinhVien implements Serializable {
    private int maSV;
    private String tenSV;
    private int namSinh;

    public SinhVien(int maSV, String tenSV, int namSinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.namSinh = namSinh;
    }

    public SinhVien() {

    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", tenSV='" + tenSV + '\'' +
                ", namSinh=" + namSinh +
                '}' + "\n";
    }
}
