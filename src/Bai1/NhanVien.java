package Bai1;

public class NhanVien {
    private int maNV;
    private String tenNV;
    private double doanhThu;

    public NhanVien(int maNV, String tenNV, double doanhThu) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.doanhThu = doanhThu;
    }

    public NhanVien(){}

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }


    public void displayInfo() {
        System.out.println("Ma nhan vien: " + maNV + ", Ho ten: " + tenNV + ", Doanh thu: " +doanhThu );
    }

    @Override
    public String toString() {
        return "QuanLyNhanVien{" +
                "maNV=" + maNV +
                ", tenNV='" + tenNV + '\'' +
                ", doanhThu=" + doanhThu +
                '}';
    }



}
