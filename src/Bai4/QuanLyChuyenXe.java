package Bai4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe implements ChuyenXe {
    private List<ChuyenXe> danhSachChuyenXe;

    public QuanLyChuyenXe() {
        danhSachChuyenXe = new ArrayList<>();
    }

    @Override
    public String getMaSoChuyen() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getHoTenTaiXe() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Integer getSoXe() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getLoaiChuyenXe() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getDoanhThu() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double tinhTienThuong(double tyLeThuong) {
        // TODO Auto-generated method stub
        return 0;
    }

    // Tìm xe có tổng doanh thu cao nhất
    public ChuyenXe timXeCoTongDoanhThuCaoNhat() {
        ChuyenXe xeCoTongDoanhThuCaoNhat = danhSachChuyenXe.get(0);
        double tongDoanhThuMax = xeCoTongDoanhThuCaoNhat.getDoanhThu();

        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            if (chuyenXe.getDoanhThu() > tongDoanhThuMax) {
                xeCoTongDoanhThuCaoNhat = chuyenXe;
                tongDoanhThuMax = chuyenXe.getDoanhThu();
            }
        }

        return xeCoTongDoanhThuCaoNhat;
    }

    // Tính tổng doanh thu của chuyến xe nội thành hoặc ngoại thành
    public double tinhTongDoanhThu(String loaiChuyenXe) {
        double tongDoanhThu = 0;

        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            if (chuyenXe.getLoaiChuyenXe().equals(loaiChuyenXe)) {
                tongDoanhThu += chuyenXe.getDoanhThu();
            }
        }

        return tongDoanhThu;
    }

    // Tính tổng tiền thưởng của chuyến xe nội thành hoặc ngoại thành
    public double tinhTongTienThuong(String loaiChuyenXe, double tyLeThuong) {
        double tongTienThuong = 0;

        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            if (chuyenXe.getLoaiChuyenXe().equals(loaiChuyenXe)) {
                double tienThuong = chuyenXe.tinhTienThuong(tyLeThuong);
                tongTienThuong += tienThuong;
            }
        }

        return tongTienThuong;
    }

    public double tinhTongDoanhThuTheoLoai(String loai) {
        double tongDoanhThu = 0;
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            if (chuyenXe instanceof XeNoiThanh && loai.equalsIgnoreCase("noi thanh")) {
                tongDoanhThu += chuyenXe.getDoanhThu();
            } else if (chuyenXe instanceof XeNgoaiThanh && loai.equalsIgnoreCase("ngoai thanh")) {
                tongDoanhThu += chuyenXe.getDoanhThu();
            }
        }
        return tongDoanhThu;
    }

    public QuanLyChuyenXe(List<ChuyenXe> danhSachChuyenXe) {
        this.danhSachChuyenXe = danhSachChuyenXe;
    }
    double tongTienThuong = 0;
//    if (.equals("noi thanh")) {
//        for (ChuyenXe cx : danhSachChuyenXe) {
//            if (cx instanceof ChuyenXeNoiThanh) {
//                tongTienThuong += cx.tinhTienThuong();
//            }
//        }
//    } else if (loai.equals("ngoai thanh")) {
//        for (ChuyenXe cx : danhSachChuyenXe) {
//            if (cx instanceof ChuyenXeNgoaiThanh) {
//                tongTienThuong += cx.tinhTienThuong();
//            }
//        }
//    }
//    return tongTienThuong;
}

