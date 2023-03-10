public class PhanSo {
    private int tuSo;
    public int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    @Override
    public String toString() {
        return "PhanSo{" +
                "tuSo=" + tuSo +
                ", mauSo=" + mauSo +
                '}';
    }

    public PhanSo congPhanSo(PhanSo ps) {
        int mauMoi, tuMoi;

        tuMoi = this.tuSo * ps.mauSo + this.mauSo * ps.tuSo;
        mauMoi = this.mauSo * ps.mauSo;

        return new PhanSo(tuMoi, mauMoi).toiGianPhanSo(tuMoi , mauMoi) ;

    }

    public PhanSo truPhanSo(PhanSo ps) {
        int mauMoi, tuMoi;

        tuMoi = this.tuSo * ps.mauSo - this.mauSo * ps.tuSo;
        mauMoi = this.mauSo * ps.mauSo;

        return new PhanSo(tuMoi, mauMoi).toiGianPhanSo(tuMoi , mauMoi);
    }

    public PhanSo nhanPhanSo(PhanSo ps) {
        int mauMoi, tuMoi;

        tuMoi = this.tuSo * ps.tuSo;
        mauMoi = this.mauSo * ps.mauSo;

        return new PhanSo(tuMoi, mauMoi).toiGianPhanSo(tuMoi , mauMoi);
    }

    public PhanSo chiaPhanSo(PhanSo ps) {
        int mauMoi, tuMoi;

        tuMoi = this.tuSo * ps.mauSo;
        mauMoi = this.mauSo * ps.mauSo;

        return new PhanSo(tuMoi, mauMoi).toiGianPhanSo(tuMoi , mauMoi);
    }

    public static int timUCLN(int tuSo, int mauSo) { // dung` euclid ??
        if (mauSo == 0) {
            return tuSo;
        } else {
            return timUCLN(mauSo, tuSo % mauSo);
        }
    }

    public PhanSo toiGianPhanSo(int tuSo, int mauSo) {
        int mauMoi, tuMoi, UCLN;
        UCLN = timUCLN(tuSo, mauSo);

        tuMoi = this.tuSo / UCLN;
        mauMoi = this.mauSo / UCLN;

        return new PhanSo(tuMoi, mauMoi);
    }


}