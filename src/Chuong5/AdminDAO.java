package Chuong5;

import java.sql.SQLException;
import java.util.List;

public class AdminDAO {

    public static void main(String[] args) throws SQLException {


//        SInhVien sv = listSV.get(0);
//        sv.setMasinhvien(sv.getMasinhvien() + "1");
//        SInhVien.create(new SInhVien("20211tt4789","tien",2001,"cd19tt9"));
//        SInhVien.delete("tien");

//        System.out.println( SInhVien.readByID("20211tt4780"));
//        SInhVien.readByName("a").forEach(System.out::println);
    SInhVien sv = new SInhVien("20211tt4782","Truong thai Anh",2003,"CS20MT9");
        System.out.println(sv.save());
//        List<SInhVien> listSV = SInhVien.readALL(); // both biên và object
//        for (int i = 0; i < listSV.size(); i++) {
//            System.out.println(listSV.get(i));
//        }
    }
}
