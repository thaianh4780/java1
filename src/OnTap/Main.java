package OnTap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();
//        dsSinhVien.add(new SinhVien(1, "Thang Ngu 2", 1999));
//        System.out.println(dsSinhVien.toString());

        QLSV qlsv = new QLSV(dsSinhVien);

//        qlsv.themSV(new SinhVien(1, "Thang Ngu 2", 1999));

//        System.out.println(qlsv.timSV23Tuoi());
        System.out.println( qlsv.sapXepSinhVien());

    }


}
