package OnTap;

import java.io.*;
import java.util.ArrayList;

public class QLSV implements Serializable {
    private ArrayList<SinhVien> danhSachSV;

    public QLSV(ArrayList<SinhVien> danhSachSV) {
        this.danhSachSV = danhSachSV;
    }

    public QLSV() {
        this.danhSachSV = new ArrayList<SinhVien>();
    }

    public  void themSV(SinhVien sv) {
        danhSachSV.add(sv);

    }

    @Override
    public String toString() {
        return "QLSV{" +
                "danhSachSV=" + danhSachSV +
                '}';
    }

    public void xoaSv(int maSV) {
        for (SinhVien sv : danhSachSV) {
            if (sv.getMaSV() == maSV) {
                danhSachSV.remove(sv);
                break;
            }
        }
    }

    public void suaSV(int maSV, SinhVien sv) {
        for (int i = 0; i < danhSachSV.size(); i++) {
            SinhVien sVien = danhSachSV.get(i);
            if (sv.getMaSV() == maSV) {
                danhSachSV.set(i, sVien);
                break;
            }
        }
    }

    public  void ghiGL(String tenFile, ArrayList<SinhVien> dssv) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(tenFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(dssv);

            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("done");
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public  ArrayList<SinhVien> docGL(String tenFile) {

        ArrayList<SinhVien> dsSV = new ArrayList<SinhVien>();

        try {
            FileInputStream fileInputStream = new FileInputStream(tenFile);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            dsSV = (ArrayList<SinhVien>) objectInputStream.readObject();
//            for (SinhVien sv : dsSV){
//                System.out.println(sv);
//            }

            fileInputStream.close();
            objectInputStream.close();

            System.out.println("done reac");


        } catch (Exception e) {
            System.out.println(e);
        }

        return  dsSV ;
    }

    public static void main(String[] args) {
//        QLSV qlsv = new QLSV();
//        ArrayList<SinhVien> dsSinhViens = new ArrayList<SinhVien>();
//        dsSinhViens.add(new SinhVien(1, "Nguyen Van A", 2002));
////        ghiGL("dmthang1", dsSinhViens);
////         docGL("dmthang1");
//        qlsv.themSV(new SinhVien(2,"ha minh thang",2001));
////        System.out.println(qlsv.toString());
//
////        for (SinhVien sv : qlsv.danhSachSV){
////            System.out.println(sv);
////        }
//        System.out.println(qlsv.toString());
    }


}
