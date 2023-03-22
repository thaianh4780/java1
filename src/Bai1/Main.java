package Bai1;

public class Main {
    public static void main(String[] args) {
        QuanLyXe qlXe = new QuanLyXe();
        // Thêm các xe vào danh sách
        qlXe.themXe(new Xe("Honda", 1000000, 2020));
        qlXe.themXe(new Oto("KIA", 2000000, 2019, 5, 1500));
        qlXe.themXe(new Oto("Toyota", 1500000, 2018, 7, 1200));
        qlXe.themXe(new Oto("Ford", 1800000, 2017, 8, 1800));

        // In danh sách các xe
        qlXe.inDanhSachXe();

//        // Xuất thông tin các Oto có trọng tải lớn hơn 1000 tấn
//        qlXe.xuatThongtinOtoTrongTaiLonHon1000Tan();
//
//        // Xuất thông tin các Oto của nhãn hiệu 'KIA'
//        qlXe.xuatThongTinOtoHangKIA();
    }
}
