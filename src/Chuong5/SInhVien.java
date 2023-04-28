package Chuong5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SInhVien {

    private String masinhvien;
    private String tensinhvien;
    private Integer namsinh;
    private String malop;

    public static String[] colTable = {
            "masinhvien",
            "tensinhvien",
            "namsinh",
            "malop"
    };

    public String getMasinhvien() {
        return masinhvien;
    }

    public String getTensinhvien() {
        return tensinhvien;
    }

    public void setTensinhvien(String tensinhvien) {
        this.tensinhvien = tensinhvien;
    }

    public Integer getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(Integer namsinh) {
        this.namsinh = namsinh;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public SInhVien(ResultSet rs) throws SQLException {
        this.masinhvien = rs.getString(colTable[0]);
        this.tensinhvien = rs.getString(colTable[1]); // có thể là thứ tự cột hoặc tên cột
        this.namsinh = rs.getInt(colTable[2]);
        this.malop = rs.getNString(colTable[3]);
    }

    public SInhVien(String masinhvien, String tensinhvien, Integer namsinh, String malop) {
        this.masinhvien = masinhvien;
        this.tensinhvien = tensinhvien;
        this.namsinh = namsinh;
        this.malop = malop;
    }

    public static List<SInhVien> readALL() throws SQLException {
        Connection connection = DataBaseUtil.getConnection();
        String sql = "SELECT masinhvien, tensinhvien, namsinh,malop FROM sinhvien";
        ResultSet rs = connection.createStatement().executeQuery(sql);

        List<SInhVien> listSV = new ArrayList<SInhVien>();

        while (rs.next()) {
            listSV.add(new SInhVien(rs));
        }

        return listSV;
    }


    public static boolean delete(String name) throws SQLException {
        Connection connection = DataBaseUtil.getConnection();
        String sql = "DELETE FROM `sinhvien` WHERE tensinhvien = ? ";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);

        return ps.execute();
    }

    public static SInhVien readByID(String id) throws SQLException {
        Connection connection = DataBaseUtil.getConnection();
        String sql = "SELECT * FROM `sinhvien` WHERE masinhvien = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, id);

        ResultSet rs = ps.executeQuery();
        if (rs.next())
            return new SInhVien(rs);

        return null;
    }

    public static List<SInhVien> readByName(String name) throws SQLException {
        Connection connection = DataBaseUtil.getConnection();
        String sql = "SELECT * FROM `sinhvien` WHERE UPPER(tensinhvien) LIKE UPPER(?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, "%" + name + "%");

        ResultSet rs = ps.executeQuery();
        List<SInhVien> listSV = new ArrayList<SInhVien>();

        while (rs.next()) {
            listSV.add(new SInhVien(rs));
        }

        return listSV;
    }


    public boolean save() throws  SQLException{
        Connection connection = DataBaseUtil.getConnection();
        String sql = "REPLACE INTO sinhvien(`masinhvien`,`tensinhvien`,`namsinh`,`malop`) VALUES (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql); // check param
        ps.setString(1, this.getMasinhvien());
        ps.setString(2, this.getTensinhvien());
        ps.setInt(3, this.getNamsinh());
        ps.setString(4, this.getMalop());
        return ps.executeUpdate() != 0;
    }

    @Override
    public String toString() {
        return "Chuong5{" +
                "masinhvien='" + masinhvien + '\'' +
                ", tensinhvien='" + tensinhvien + '\'' +
                ", namsinh=" + namsinh +
                ", malop='" + malop + '\'' +
                '}';
    }
}
