package Bai3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sach sach1 = new Sach("MS001", "NXB Kim Đồng", "Harry Potter", 100000, "J.K. Rowling", 350);
        Sach sach2 = new Sach("MS002", "NXB Trẻ", "Nhà Giả Kim", 75000, "Paulo Coelho", 200);
        Sach sach3 = new Sach("MS003", "NXB Thế Giới", "Đắc Nhân Tâm", 85000, "Dale Carnegie", 300);

        TapChi tapChi1 = new TapChi("MT001","dcm","ngon lu",2000,"1",10,5);
        TapChi tapChi2 = new TapChi("MT002", "NXB Trẻ", "Tuổi Trẻ", 30000, "2", 6,5);


        List<TaiLieu> danhSachTaiLieu = new ArrayList<>();
        danhSachTaiLieu.add(sach1);
        danhSachTaiLieu.add(sach2);
        danhSachTaiLieu.add(sach3);
        danhSachTaiLieu.add(tapChi1);
        danhSachTaiLieu.add(tapChi2);


        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu(danhSachTaiLieu);

        System.out.println("Danh sách tài liệu theo loại:");
        System.out.println("Sách:");
        quanLyTaiLieu.timTaiLieuTheoLoai("Sach").forEach(System.out::println);
        System.out.println("Tạp chí:");
        quanLyTaiLieu.timTaiLieuTheoLoai("TapChi").forEach(System.out::println);

        System.out.println("Tổng tiền theo loại:");
        System.out.println("Sách: " + quanLyTaiLieu.tinhTongTienTheoLoai("Sach"));
        System.out.println("Tạp chí: " + quanLyTaiLieu.tinhTongTienTheoLoai("TapChi"));
    }

}


