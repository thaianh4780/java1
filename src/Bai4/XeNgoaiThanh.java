package Bai4;

public class XeNgoaiThanh implements ChuyenXe {
    private String maSoChuyen;
    private String hoTenTaiXe;
    private Integer soXe;
    private String noiDen;
    private int soNgayDi;
    private double doanhThu;

    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, Integer soXe, String noiDen, int soNgayDi, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
        this.doanhThu = doanhThu;
    }

    @Override
    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    @Override
    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    @Override
    public Integer getSoXe() {
        return soXe;
    }

    @Override
    public String getLoaiChuyenXe() {
        return null;
    }

    public void setSoXe(Integer soXe) {
        this.soXe = soXe;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public int getSoNgayDi() {
        return soNgayDi;
    }

    public void setSoNgayDi(int soNgayDi) {
        this.soNgayDi = soNgayDi;
    }

    @Override
    public double getDoanhThu() {
        return doanhThu;
    }

    @Override
    public double tinhTienThuong(double tyLeThuong) {
        return doanhThu*tyLeThuong;
    }


    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
}
