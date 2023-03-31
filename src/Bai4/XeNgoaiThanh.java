package Bai4;

public class XeNgoaiThanh implements ChuyenXe {
    private String maSoChuyen;
    private String hoTenTaiXe;
    private double doanhThu;
    private int soXe;
    private String noiDen;
    private int soNgayDiDuoc;

    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, double doanhThu, int soXe, String noiDen, int soNgayDiDuoc) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.doanhThu = doanhThu;
        this.soXe = soXe;
        this.noiDen = noiDen;
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDiDuoc() {
        return soNgayDiDuoc;
    }

    public void setSoNgayDiDuoc(int soNgayDiDuoc) {
        this.soNgayDiDuoc = soNgayDiDuoc;
    }

    @Override
    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    @Override
    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    @Override
    public Integer getSoXe() {
        return soXe;
    }

    @Override
    public String getLoaiChuyenXe() {
        return "Ngoại thành";
    }

    @Override
    public double getDoanhThu() {
        return doanhThu;
    }

    @Override
    public double tinhTienThuong(){
        double tienThuong = doanhThu*0.05;
        return tienThuong;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nơi đến: " + noiDen + ", Số ngày đi được: " + soNgayDiDuoc;
    }
}
