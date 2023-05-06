package RanSanMoi;

public class User {
    private String ten;
    private String level;
    private String diem;

    public User(String ten, String level, String diem) {
        this.ten = ten;
        this.level = level;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDiem() {
        return diem;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }



    @Override
    public String toString() {
        return ten+" "+level +" "+diem;
    }

    public User() {
    }



}
