package Bai4;

public class XeNoiThanh implements ChuyenXe {
    private String maSoChuyen;
    private String hoTenTaiXe;
    private int soXe;
    private double doanhThu;
    private int soTuyen;
    private int soKmDiDuoc;

    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, int soXe, double doanhThu, int soTuyen, int soKmDiDuoc) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
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
        return "Nội thành";
    }

    @Override
    public double getDoanhThu() {
        return doanhThu;
    }

    @Override
    public double tinhTienThuong() {
        double tienThuong = doanhThu * 0.1;
        return tienThuong;
    }

    @Override
    public String toString() {
        return "XeNoiThanh{" +
                "maSoChuyen= " + maSoChuyen +
                ", hoTenTaiXe= " + hoTenTaiXe +
                ", soXe= " + soXe +
                ", doanhThu= " + doanhThu +
                ", soTuyen= " + soTuyen +
                ", soKmDiDuoc= " + soKmDiDuoc +
                ", Tong doanh thu= " + (doanhThu + getDoanhThu() )+
                '}';
    }
}
