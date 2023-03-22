package Bai4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách các chuyến xe
        ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();
        dsChuyenXe.add(new XeNoiThanh("001", "Nguyen Van A", "79A-12345", "01", 50, 2000000,1));
        dsChuyenXe.add(new XeNoiThanh("002", "Tran Thi B", "79B-54321", "02", 40, 1500000));
        dsChuyenXe.add(new XeNgoaiThanh("003", "Le Van C", "79C-67890", "Da Nang", 3, 5000000));
        dsChuyenXe.add(new XeNgoaiThanh("004", "Pham Thi D", "79D-24680", "Nha Trang", 4, 6000000));
        dsChuyenXe.add(new XeNoiThanh("005", "Hoang Van E", "79E-13579", "03", 30, 1200000));
        dsChuyenXe.add(new XeNoiThanh("006", "Nguyen Thi F", "79F-24680", "04", 60, 2500000));
        dsChuyenXe.add(new XeNgoaiThanh("007", "Tran Van G", "79G-13579", "Hue", 2, 4000000));
        dsChuyenXe.add(new XeNgoaiThanh("008", "Le Thi H", "79H-12345", "Sapa", 5, 8000000));

        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe(dsChuyenXe);

        // Tìm xe có tổng doanh thu cao nhất
        ChuyenXe xeCoTongDoanhThuCaoNhat = quanLyChuyenXe.timXeCoTongDoanhThuCaoNhat();
        System.out.println("Thông tin xe có tổng doanh thu cao nhất: ");
        System.out.println(xeCoTongDoanhThuCaoNhat);

        // Tính tổng doanh thu các chuyến xe theo loại
        System.out.println("Tổng doanh thu xe nội thành: " + quanLyChuyenXe.tinhTongDoanhThuTheoLoai(LoaiChuyenXe.NOI_THANH));
        System.out.println("Tổng doanh thu xe ngoại thành: " + quanLyChuyenXe.tinhTongDoanhThuTheoLoai(LoaiChuyenXe.NGOAI_THANH));

        // Tính tổng tiền thưởng của các chuyến xe theo loại
        System.out.println("Tổng tiền thưởng xe nội thành: " + quanLyChuyenXe.tinhTongTienThuongTheoLoai(LoaiChuyenXe.NOI_THANH));
        System.out.println("Tổng tiền thưởng xe ngoại thành: "+ quanLyChuyenXe.tinhTongDoanhThuTheoLoai()