package Bai4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách các chuyến xe
        ArrayList<ChuyenXe> dsChuyenXe = new ArrayList<>();
        dsChuyenXe.add(new XeNoiThanh("04","Nguyen Van D",4,5000,4,300));
        dsChuyenXe.add(new XeNoiThanh("05","Nguyen Van E",5,15000,5,1000));
        dsChuyenXe.add(new XeNoiThanh("06","Nguyen Van F",6,2000,6,200));
       dsChuyenXe.add(new XeNgoaiThanh("01" ,"Tran Van A",2000,1,"Vung Tau",20));
       dsChuyenXe.add(new XeNgoaiThanh("02" ,"Tran Van b",5000,2,"Da lat",60));
       dsChuyenXe.add(new XeNgoaiThanh("03" ,"Tran Van c",3000,3,"Ha Noi",10));


        // Tạo đối tượng quản lý chuyến xe
        QuanLyChuyenXe quanLyChuyenXe = new QuanLyChuyenXe(dsChuyenXe);

        // Tìm xe có tổng doanh thu cao nhất
        ChuyenXe xeCoTongDoanhThuCaoNhat = quanLyChuyenXe.timXeCoTongDoanhThuCaoNhat();
        System.out.println("Xe co tong doanh thu cao nhat:");
        System.out.println(xeCoTongDoanhThuCaoNhat);

//
//        ChuyenXe tongDoanhThuNoiThanh = quanLyChuyenXe.timXeCoTongDoanhThuCaoNhat();
//        System.out.println("Tong Doanh Thu Noi Thanh"+tongDoanhThuNoiThanh);

//        // Tính tổng doanh thu của chuyến xe nội thành
//        double tongDoanhThuNoiThanh = quanLyChuyenXe.tinhTongDoanhThu("noi thanh");
//        System.out.println("Tong doanh thu chuyen xe noi thanh: " + tongDoanhThuNoiThanh);
//
//        // Tính tổng tiền thưởng của chuyến xe nội thành
//        double tongTienThuongNoiThanh = quanLyChuyenXe.tinhTongTienThuong("noi thanh", 0.05);
//        System.out.println("Tong tien thuong chuyen xe noi thanh: " + tongTienThuongNoiThanh);
//
//        // Tính tổng doanh thu của chuyến xe ngoại thành
//        double tongDoanhThuNgoaiThanh = quanLyChuyenXe.tinhTongDoanhThu("ngoai thanh");
//        System.out.println("Tong doanh thu chuyen xe ngoai thanh: " + tongDoanhThuNgoaiThanh);

    }
}