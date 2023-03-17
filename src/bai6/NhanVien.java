package bai6;

import java.io.*;
import java.util.List;

public class NhanVien {


    private String maNV;
    private String hoTen;
    private int tuoi;
    private double luong;

    public NhanVien(String maNV, String hoTen, int tuoi, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.luong = luong;
    }
    public String getMaNv() {
        return maNV;
    }

    public void setMaNv(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    // phương thức ghi danh sách nhân viên dưới dạng text vào file 'nhanvien.txt'
    public static void ghiDanhSachNV(List<NhanVien> dsNV, String filename) {
        try {
            FileWriter fw = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(fw);
            for (NhanVien nv : dsNV) {
                pw.println(nv.maNV + ";" + nv.hoTen + ";" + nv.tuoi + ";" + nv.luong);
            }
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // phương thức ghi thêm nhân viên vào file 'nhanvien.txt'
    public static void ghiThemNV(NhanVien nv, String filename) {
        try {
            FileWriter fw = new FileWriter(filename, true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(nv.maNV + ";" + nv.hoTen + ";" + nv.tuoi + ";" + nv.luong);
            pw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // phương thức đọc danh sách nhân viên từ file 'nhanvien.txt' và in danh sách ra màn hình
    public static void docVaInDSNV(String filename) {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String line;
            System.out.printf("%-10s %-20s %-10s %s\n", "Mã NV", "Họ tên", "Tuổi", "Lương");
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String maNV = parts[0];
                String hoTen = parts[1];
                int tuoi = Integer.parseInt(parts[2]);
                double luong = Double.parseDouble(parts[3]);
                System.out.printf("%-10s %-20s %-10d %,.0f\n", maNV, hoTen, tuoi, luong);
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                '}';
    }
}
