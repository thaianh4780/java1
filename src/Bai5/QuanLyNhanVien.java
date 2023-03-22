package Bai5;


import Bai4.ChuyenXe;

import java.util.List;

public class QuanLyNhanVien {
    private List<NhanVien> danhSachNhanVien;

    public QuanLyNhanVien(List<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    public List<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }


    public void setDanhSachNhanVien(List<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }

    public void themNhanVien(NhanVien nhanVien) {
        danhSachNhanVien.add(nhanVien);
    }

//    public List<NhanVien> getDanhSachNhanVien() {
//        return danhSachNhanVien;
//    }

//    public void setDanhSachTaiLieu(List<TaiLieu> danhSachTaiLieu) {
//        this.danhSachTaiLieu = danhSachTaiLieu;
//    }

//    // phương thức tìm kiếm tài liệu theo loại
//    public List<TaiLieu> timTaiLieuTheoLoai(String loaiTaiLieu) {
//        List<TaiLieu> ketQua = new ArrayList<>();
//        for (TaiLieu taiLieu : danhSachTaiLieu) {
//            if (taiLieu.getClass().getSimpleName().equals(loaiTaiLieu)) {
//                ketQua.add(taiLieu);
//            }
//        }
//        return ketQua;
//    }

    //    // phương thức tính tổng tiền theo loại
//    public double tinhTongTienTheoLoai(String loaiTaiLieu) {
//        double tongTien = 0.0;
//        for (TaiLieu taiLieu : danhSachTaiLieu) {
//            if (taiLieu.getClass().getSimpleName().equals(loaiTaiLieu)) {
//                tongTien += taiLieu.getGia();
//            }
//        }
//        return tongTien;
//
//    }
// Tìm xe có tổng doanh thu cao nhất
    public NhanVien timNgCoTongDoanhThuCaoNhat() {
        NhanVien ngCoTongDoanhThuCaoNhat = danhSachNhanVien.get(0);
        double tongDoanhThuMax = ngCoTongDoanhThuCaoNhat.tinhLuong();

        for (NhanVien nhanVien :danhSachNhanVien ) {
            if (nhanVien.tinhLuong() > tongDoanhThuMax) {
                ngCoTongDoanhThuCaoNhat = nhanVien;
                tongDoanhThuMax = nhanVien.tinhLuong();
            }
        }

        return ngCoTongDoanhThuCaoNhat;
    }

//    public NhanVien tinhSoNhanVienHopDong(){
//        NhanVienHopDong tongNhanVienHopDong = danhSachNhanVien.
//    }
}
