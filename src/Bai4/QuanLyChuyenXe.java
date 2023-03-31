package Bai4;

import java.util.ArrayList;
import java.util.List;

public class QuanLyChuyenXe {

    private List<ChuyenXe> danhSachChuyenXe;

    public void  themXe(ChuyenXe chuyenXe){
        danhSachChuyenXe.add(chuyenXe);
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
                double tienThuong = chuyenXe.tinhTienThuong();
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
}

