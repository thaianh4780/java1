package Bai2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo ra một danh sách các xe trong bãi đỗ xe
        List<Xe> danhSachXe = new ArrayList<>();
        danhSachXe.add(new XeHoi("30C1-1234", "Đen", 5, "Toyota"));
        danhSachXe.add(new XeHoi("30C2-5678", "Trắng", 7, "Honda"));
        danhSachXe.add(new XeHoi("30C3-9012", "Xanh", 40, "Ford"));
        danhSachXe.add(new XeBus("29B-12345", "Xanh", 50, "Bến Thành - Suối Tiên"));
        danhSachXe.add(new XeBus("29B-67890", "Đỏ", 30, "Bến Thành - Đông Hới"));

        // Tạo ra một đối tượng QuanLyBaiXe để quản lý các xe này
        QuanLyBaiXe quanLyBaiXe = new QuanLyBaiXe(danhSachXe);

        // Tính tổng tiền phí thu được
        double tongTienPhi = quanLyBaiXe.tinhTongPhi();
        System.out.println("Tổng tiền phí thu được: " + tongTienPhi + " đồng");
    }
}
