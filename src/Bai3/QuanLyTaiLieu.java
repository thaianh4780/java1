package Bai3;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu {
    private List<TaiLieu> danhSachTaiLieu;

    public QuanLyTaiLieu(List<TaiLieu> danhSachTaiLieu) {
        this.danhSachTaiLieu = danhSachTaiLieu;
    }


    public void themTaiLieu(TaiLieu taiLieu) {
        danhSachTaiLieu.add(taiLieu);
    }

    public List<TaiLieu> getDanhSachTaiLieu() {
        return danhSachTaiLieu;
    }

    public void setDanhSachTaiLieu(List<TaiLieu> danhSachTaiLieu) {
        this.danhSachTaiLieu = danhSachTaiLieu;
    }

    // phương thức tìm kiếm tài liệu theo loại
    public List<TaiLieu> timTaiLieuTheoLoai(String loaiTaiLieu) {
        List<TaiLieu> ketQua = new ArrayList<>();
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getClass().getSimpleName().equals(loaiTaiLieu)) {
                ketQua.add(taiLieu);
            }
        }
        return ketQua;
    }

    // phương thức tính tổng tiền theo loại
    public double tinhTongTienTheoLoai(String loaiTaiLieu) {
        double tongTien = 0.0;
        for (TaiLieu taiLieu : danhSachTaiLieu) {
            if (taiLieu.getClass().getSimpleName().equals(loaiTaiLieu)) {
                tongTien += taiLieu.getGia();
            }
        }
        return tongTien;

    }


}
