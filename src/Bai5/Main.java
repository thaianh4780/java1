package Bai5;

public class Main {
    public static void main(String[] args) {
        QuanLyThiSinh quanLy = new QuanLyThiSinh(24);

        ThiSinh ts1 = new ThiSinh("001", "Nguyen Van A", 8.5, 9, 7.5);
        ThiSinh ts2 = new ThiSinh("002", "Tran Thi B", 7.5, 8, 9);
        ThiSinh ts3 = new ThiSinh("003", "Le Van C", 6, 6.5, 7);
        ThiSinh ts4 = new ThiSinh("004", "Pham Thi D", 7, 8, 7);
        ThiSinh ts5 = new ThiSinh("005", "Doan Van E", 8, 7.5, 9);


        quanLy.themThiSinh(ts1);
        quanLy.themThiSinh(ts2);
        quanLy.themThiSinh(ts3);
        quanLy.themThiSinh(ts4);

        quanLy.xuatThiSinhTrungTuyen();

        quanLy.xoaThiSinh("003");

        quanLy.suaThiSinh("002", ts5);

        quanLy.xuatThiSinhTrungTuyen();

    }
}
