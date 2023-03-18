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

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<SinhVien> danhSachSinhVien = khoiTaoDanhSachSinhVien();

        ghiDanhSachSinhVienXuongFile(danhSachSinhVien);

        List<SinhVien> danhSachSinhVienDaDoc = docDanhSachSinhVienTuFile();

        hienThiSoTuoiTrungBinh(danhSachSinhVienDaDoc);

        hienThiDanhSachSinhVienCoTuoiLonNhat(danhSachSinhVienDaDoc);

        hienThiSoTuoiLonNhat(danhSachSinhVienDaDoc);
    }

    public static List<SinhVien> khoiTaoDanhSachSinhVien() {
        List<SinhVien> danhSachSinhVien = new ArrayList<>();
        danhSachSinhVien.add(new SinhVien(1, "Nguyen Van A", LocalDate.of(2000, 1, 1), "A1"));
        danhSachSinhVien.add(new SinhVien(2, "Tran Thi B", LocalDate.of(2001, 2, 2), "A2"));
        danhSachSinhVien.add(new SinhVien(3, "Le Van C", LocalDate.of(2002, 3, 3), "A3"));
        danhSachSinhVien.add(new SinhVien(4, "Hoang Thi D", LocalDate.of(2003, 4, 4), "A4"));
        danhSachSinhVien.add(new SinhVien(5, "Pham Van E", LocalDate.of(2004, 5, 5), "A5"));
        return danhSachSinhVien;
    }

    public static void ghiDanhSachSinhVienXuongFile(List<SinhVien> danhSachSinhVien) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("dssinhvien.dat"));
        System.out.println("done writing");
        oos.writeObject(danhSachSinhVien);
        oos.close();
    }

    public static List<SinhVien> docDanhSachSinhVienTuFile() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("dssinhvien.dat"));
        List<SinhVien> danhSachSinhVienDaDoc = (List<SinhVien>) ois.readObject();
        System.out.println("done reading");
        ois.close();
        return danhSachSinhVienDaDoc;
    }

    public static void hienThiSoTuoiTrungBinh(List<SinhVien> danhSachSinhVienDaDoc) {
        double trungBinhTuoi = danhSachSinhVienDaDoc.stream()
                .mapToInt(SinhVien::getTuoi)
                                    .average()
                                    .getAsDouble();

        System.out.println("Số tuổi trung bình: " + trungBinhTuoi);
    }


    public static void hienThiDanhSachSinhVienCoTuoiLonNhat(List<SinhVien> danhSachSinhVien) {
        int tuoiMax = danhSachSinhVien.stream()
                                        .mapToInt(SinhVien::getTuoi).max().orElse(0);
        danhSachSinhVien.stream()
                .filter(sv -> sv.getTuoi() == tuoiMax)
                .forEach(sv -> System.out.println(sv.getMaSo() + " " + sv.getHoTen() + " " + sv.getNamSinh() + " " + sv.getLop()));
    }

    public static void hienThiSoTuoiLonNhat(List<SinhVien> danhSachSinhVien) {
        int maxTuoi = danhSachSinhVien.stream()
                .mapToInt(SinhVien::getTuoi)
                .max()
                .getAsInt();
        System.out.println("Số tuổi lớn nhất: " + maxTuoi);
    }
}


