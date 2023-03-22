package Bai4;

public class XeNoiThanh implements ChuyenXe {
    private String maSoChuyen;
    private String hoTenTaiXe;
    private Integer soTuyen;
    private Integer soKmDiDc;
    private double doanhThu;

    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, Integer soTuyen, Integer soKmDiDc, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soTuyen = soTuyen;
        this.soKmDiDc = soKmDiDc;
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

    @Override
    public Integer getSoXe() {
        return null;
    }

    @Override
    public String getLoaiChuyenXe() {
        return null;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public Integer getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(Integer soTuyen) {
        this.soTuyen = soTuyen;
    }

    public Integer getSoKmDiDc() {
        return soKmDiDc;
    }

    public void setSoKmDiDc(Integer soKmDiDc) {
        this.soKmDiDc = soKmDiDc;
    }

    @Override
    public double getDoanhThu() {
        return doanhThu;
    }

    @Override
    public double tinhTienThuong(double tyLeThuong) {
        return doanhThu *tyLeThuong;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }

    @Override
    public String toString() {
        return "XeNoiThanh{" +
                "maSoChuyen='" + maSoChuyen + '\'' +
                ", hoTenTaiXe='" + hoTenTaiXe + '\'' +
                ", soTuyen=" + soTuyen +
                ", soKmDiDc=" + soKmDiDc +
                ", doanhThu=" + doanhThu +
                '}';
    }
}
