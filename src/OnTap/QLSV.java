package OnTap;

import java.io.*;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class QLSV implements Serializable, IQLSV {
    private ArrayList<SinhVien> danhSachSV;

    public QLSV(ArrayList<SinhVien> danhSachSV) {
        this.danhSachSV = danhSachSV;
    }

    public QLSV() {
        this.danhSachSV = new ArrayList<SinhVien>();
    }

    public void themSV(SinhVien sv) {
        danhSachSV.add(sv);
        String fileName = "thang1";
        ArrayList<SinhVien> dssv = docGL(fileName);

        dssv.add(sv);
        ghiGL(fileName, dssv);

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

    public void ghiGL(String tenFile, ArrayList<SinhVien> dssv) {
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

    public ArrayList<SinhVien> docGL(String tenFile) {

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

            System.out.println("done read");


        } catch (Exception e) {
            System.out.println(e);
        }

        return dsSV;
    }


    @Override
    public List<SinhVien> timSV23Tuoi() {
        List<SinhVien> dssv = docGL("thang1");
        List<SinhVien> svs = new ArrayList<>();

        int year = Year.now().getValue();

        for (SinhVien sv : dssv) {
            if ((year - sv.getNamSinh()) >= 23) {
                svs.add(sv);
            }
        }

        return svs;
    }

    @Override
    public List<SinhVien> sapXepSinhVien() {
        List<SinhVien> dssv = docGL("thang1");

        for (int i = 0; i < dssv.size(); i++) {
            for (int j = i + 1; j < dssv.size(); j++) {
                if (dssv.get(i).getNamSinh() > dssv.get(j).getNamSinh()) {
                    SinhVien temp = dssv.get(i);
                    dssv.set(i, dssv.get(j));
                    dssv.set(j, temp);
                }
                if (dssv.get(i).getNamSinh() == dssv.get(j).getNamSinh()) {
                    if (dssv.get(i).getTenSV().compareTo(dssv.get(j).getTenSV()) > 0) {
                        SinhVien temp = dssv.get(i);
                        dssv.set(i, dssv.get(j));
                        dssv.set(j, temp);
                    }
                }
            }
        }

        return dssv;
    }
}
