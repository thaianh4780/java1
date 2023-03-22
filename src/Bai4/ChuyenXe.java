package Bai4;

public interface ChuyenXe {
    // Trả về mã số chuyến xe
    public String getMaSoChuyen();

    // Trả về họ tên tài xế
    public String getHoTenTaiXe();

    // Trả về số xe
    public Integer getSoXe();

    // Trả về loại chuyến xe (nội thành hoặc ngoại thành)
    public String getLoaiChuyenXe();

    // Trả về doanh thu của chuyến xe
    public double getDoanhThu();

    // Tính tiền thưởng của chuyến xe theo tỷ lệ % cho trước
    public double tinhTienThuong(double tyLeThuong);
}
