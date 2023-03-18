package bai7;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SinhVien implements Serializable {
    private int maSo;
    private String hoTen;
    private LocalDate namSinh;
    private String lop;

    public SinhVien(int maSo, String hoTen, LocalDate namSinh, String lop) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.lop = lop;
    }

    public SinhVien() {
    }

    public int getMaSo() {
        return maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public LocalDate getNamSinh() {
        return namSinh;
    }

    public String getLop() {
        return lop;
    }

    public int getTuoi() {
        return LocalDate.now().getYear() - namSinh.getYear();
    }
}






