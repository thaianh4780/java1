package Bai5;

import java.util.Arrays;
import java.util.List;

public class QuanLyNhanVien {

    private NhanVien[] danhSachNhanVien;

    public QuanLyNhanVien() {
        danhSachNhanVien = new NhanVien[0];
    }

    public void themNhanVien(NhanVien nhanVien) {
        danhSachNhanVien = Arrays.copyOf(danhSachNhanVien, danhSachNhanVien.length + 1);
        danhSachNhanVien[danhSachNhanVien.length - 1] = nhanVien;
    }

    public int demSoLuongNhanVienHopDong() {
        int count = 0;
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien instanceof NhanVienHopDong) {
                count++;
            }
        }
        return count;
    }

    public void xuatNhanVienLuongCaoNhat() {
        NhanVien nhanVienLuongCaoNhat = danhSachNhanVien[0];
        for (NhanVien nhanVien : danhSachNhanVien) {
            if (nhanVien.tinhLuong() > nhanVienLuongCaoNhat.tinhLuong()) {
                nhanVienLuongCaoNhat = nhanVien;
            }
        }
        System.out.println("Nhân viên có lương cao nhất là:");
        System.out.println(nhanVienLuongCaoNhat.toString());
    }
}
