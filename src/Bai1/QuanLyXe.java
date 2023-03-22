package Bai1;

import java.util.ArrayList;

public class QuanLyXe {
    private ArrayList<Xe> dsXe;

    public QuanLyXe() {
        dsXe = new ArrayList<>();
    }

    // phương thức thêm xe vào danh sách
    public void themXe(Xe xe) {
        dsXe.add(xe);
    }

    // phương thức in danh sách các xe
    public void inDanhSachXe() {
        for (Xe xe : dsXe) {
            System.out.println("Nhãn hiệu: " + xe.getNhanHieu()
                    + ", Giá: " + xe.getGia()
                    + ", Năm sản xuất: " + xe.getNamSanXuat());

            if (xe instanceof Oto) {
                Oto oto = (Oto) xe;
                System.out.println("Số chỗ: " + oto.getSoCho()
                        + ", Trọng tải: " + oto.getTrongTai());
            }
        }
    }

    // phương thức xuất thông tin các Oto có trọng tải lớn hơn 1000 tấn
    public void xuatThongtinOtoTrongTaiLonHon1000Tan() {
        for (Xe xe : dsXe) {
            if (xe instanceof Oto) {
                Oto oto = (Oto) xe;
                if (oto.getTrongTai() > 1000) {
                    System.out.println("Nhãn hiệu: " + oto.getNhanHieu()
                            + ", Giá: " + oto.getGia()
                            + ", Năm sản xuất: " + oto.getNamSanXuat()
                            + ", Số chỗ: " + oto.getSoCho()
                            + ", Trọng tải: " + oto.getTrongTai());
                }
            }
        }
    }

    // phương thức xuất thông tin các Oto của nhãn hiệu 'KIA'
    public void xuatThongTinOtoHangKIA() {
        for (Xe xe : dsXe) {
            if (xe instanceof Oto) {
                Oto oto = (Oto) xe;
                if (oto.getNhanHieu().equals("KIA")) {
                    System.out.println("Nhãn hiệu: " + oto.getNhanHieu()
                            + ", Giá: " + oto.getGia()
                            + ", Năm sản xuất: " + oto.getNamSanXuat()
                            + ", Số chỗ: " + oto.getSoCho()
                            + ", Trọng tải: " + oto.getTrongTai());
                }
            }
        }
    }
}
