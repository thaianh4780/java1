package Bai5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng quản lý nhân viên
        QuanLyNhanVien quanLy = new QuanLyNhanVien();

        // Thêm 5 nhân viên vào danh sách
        quanLy.themNhanVien(new NhanVienChinhThuc("CT001", "Nguyen Van A", 2.0,12 ));
        quanLy.themNhanVien(new NhanVienHopDong("HD001", "Tran Thi B", 5000000, 20,0));
        quanLy.themNhanVien(new NhanVienThoiVu("TV001", "Le Van C", 80));
        quanLy.themNhanVien(new NhanVienChinhThuc("CT002", "Pham Thi D", 1.5,10));
        quanLy.themNhanVien(new NhanVienHopDong("HD002", "Hoang Van E", 4500000, 25,20));

        // In thông tin của các nhân viên có lương cao nhất
        quanLy.xuatNhanVienLuongCaoNhat();


        // Đếm số lượng nhân viên hợp đồng
        int soLuongHD = quanLy.demSoLuongNhanVienHopDong();
        System.out.println("Số lượng nhân viên hợp đồng: " + soLuongHD);
    }
}