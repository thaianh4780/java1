package OnTap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
//        dsSinhVien.add(new SinhVien(1, "Nguyen Van A", 2002));
//        System.out.println(dsSinhVien.toString());

        QLSV qlsv = new QLSV(dsSinhVien);
        qlsv.themSV(new SinhVien(2,"Thang Ngu Lam",2002));
        qlsv.themSV(new SinhVien(3,"Thang Ngu Cuc",2001));
        qlsv.themSV(new SinhVien(4,"Thang Ngu VL",2003));
        qlsv.themSV(new SinhVien(5,"Thang Ngu 1",2004));
        qlsv.themSV(new SinhVien(8,"Thang Ngu 2",1993));
        qlsv.themSV(new SinhVien(9,"Thang Ngu 3",1990));
        qlsv.ghiGL("thang1",dsSinhVien);
        LocalDate localDate = LocalDate.now();
        int nam = localDate.getYear();
        ArrayList<SinhVien> dsTuoi = new ArrayList<SinhVien>();
//        int tuoi = 23;
        int tuoi ;
       ArrayList<SinhVien> d = qlsv.docGL("thang1");
        for (SinhVien sv : d) {
            tuoi = nam - sv.getNamSinh();
//            System.out.println(2);
            if (tuoi > 23){
                dsTuoi.add(sv);
//                System.out.println(1);
            }
        }
        System.out.println(dsTuoi.toString());

//        System.out.println(d);
//        System.out.println(dsSinhVien.toString());
//        System.out.println(qlsv.toString());

//        System.out.println(nam);
    }
}
