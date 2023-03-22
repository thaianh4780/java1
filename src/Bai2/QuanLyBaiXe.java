package Bai2;

import Bai1.QuanLyXe;

import java.util.ArrayList;
import java.util.List;

public class QuanLyBaiXe {
    private List<Xe> dsXe;

    public QuanLyBaiXe(List<Xe> dsXe) {
        this.dsXe = dsXe;
    }

    public QuanLyBaiXe() {
        dsXe = new ArrayList<>();
    }

    public void themXe(Xe xe) {
        dsXe.add(xe);
    }

    public double tinhTongPhi() {
        double tongPhi = 0;
        for (Xe xe : dsXe) {
            tongPhi += xe.dongPhi();
        }
        return tongPhi;
    }
}