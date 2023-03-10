public class HinhChuNhat {
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat() {
    }

    public HinhChuNhat(int chieuDai, int chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public int tinhDienTich() {
        return chieuDai * chieuRong;
    }

    public int tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }
}
