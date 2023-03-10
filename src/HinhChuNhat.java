public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;
    private int x;
    private int y;

    public HinhChuNhat(int chieuDai, int chieuRong, int x, int y) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean kiemTraDiem(int x1, int y1) {
        boolean thuocChuNhat = false;
        if (x1 >= x && x1 <= x + chieuRong && y1 >= y && y1 <= y + chieuDai) {
            thuocChuNhat = true;
        }
        return thuocChuNhat;
    }

    public boolean kiemTraGiaoNhau(HinhChuNhat hcn) {
        int x1 = hcn.x;
        int y1 = hcn.y;
        int chieuRong1 = hcn.chieuRong;
        int chieuDai1 = hcn.chieuDai;
        boolean coGiaoNhau = true;
        if (x + chieuRong < x1 || x1 + chieuRong1 < x || y + chieuDai < y1 || y1 + chieuDai1 < y) {
            coGiaoNhau = false;
        }
        return coGiaoNhau;
    }

    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(0, 0, 10, 5); // tạo hình chữ nhật
        HinhChuNhat hcn2 = new HinhChuNhat(5, 3, 8, 4); // tạo hình chữ nhật 2
        int x1 = 5;
        int y1 = 2;
        if (hcn.kiemTraDiem(x1, y1)) {
            System.out.println("Điểm (" + x1 + ", " + y1 + ") thuộc hình chữ nhật");
        } else {
            System.out.println("Điểm (" + x1 + ", " + y1 + ") không thuộc hình chữ nhật");
        }
        if (hcn.kiemTraGiaoNhau(hcn2)) {
            System.out.println("Hai hình chữ nhật có giao nhau");
        } else {
            System.out.println("Hai hình chữ nhật không giao nhau");
        }
    }
}