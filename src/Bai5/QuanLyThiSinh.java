package Bai5;

import java.util.ArrayList;

public class QuanLyThiSinh {
    private ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();
    private double diemChuan;

    public QuanLyThiSinh(double diemChuan) {
        this.diemChuan = diemChuan;
    }

    public void themThiSinh(ThiSinh ts) {
        danhSachThiSinh.add(ts);
    }

    public void xoaThiSinh(String soBaoDanh) {
        for (ThiSinh ts : danhSachThiSinh) {
            if (ts.getSoBaoDanh().equals(soBaoDanh)) {
                danhSachThiSinh.remove(ts);
                break;
            }
        }
    }

    public void suaThiSinh(String soBaoDanh, ThiSinh tsMoi) {
        for (int i = 0; i < danhSachThiSinh.size(); i++) {
            ThiSinh ts = danhSachThiSinh.get(i);
            if (ts.getSoBaoDanh().equals(soBaoDanh)) {
                danhSachThiSinh.set(i, tsMoi);
                break;
            }
        }
    }

    public void xuatThiSinhTrungTuyen() {
        System.out.println("Danh sach thi sinh trung tuyen:");
        for (ThiSinh ts : danhSachThiSinh) {
            if (ts.tinhTongDiem() >= diemChuan) {
                System.out.println(ts.getSoBaoDanh() + " " + ts.getHoTen());
            }
        }
    }
}