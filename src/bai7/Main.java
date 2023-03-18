package bai7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<SinhVien> danhSachSinhVien = Controller.khoiTaoDanhSachSinhVien();

            Controller.ghiDanhSachSinhVienXuongFile(danhSachSinhVien);

            List<SinhVien> danhSachSinhVienDaDoc = Controller.docDanhSachSinhVienTuFile();

            Controller.hienThiSoTuoiTrungBinh(danhSachSinhVienDaDoc);

            Controller.hienThiDanhSachSinhVienCoTuoiLonNhat(danhSachSinhVienDaDoc);

            Controller.hienThiSoTuoiLonNhat(danhSachSinhVienDaDoc);
        } catch (Exception ex) {
            System.out.println("loi ko co file " + ex.getMessage());
        }

    }
}
