import java.util.Objects;

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

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo cong(PhanSo ps) {
        int tuSoMoi = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi).toiGian();
    }

    public PhanSo tru(PhanSo ps) {
        int tuSoMoi = this.tuSo * ps.mauSo - ps.tuSo * this.mauSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi).toiGian();
    }

    public PhanSo nhan(PhanSo ps) {
        int tuSoMoi = this.tuSo * ps.tuSo;
        int mauSoMoi = this.mauSo * ps.mauSo;
        return new PhanSo(tuSoMoi, mauSoMoi).toiGian();
    }

    public PhanSo chia(PhanSo ps) {
        int tuSoMoi = this.tuSo * ps.mauSo;
        int mauSoMoi = this.mauSo * ps.tuSo;
        return new PhanSo(tuSoMoi, mauSoMoi).toiGian();
    }

    public PhanSo toiGian() {
        int ucln = timUCLN(this.tuSo, this.mauSo);
        return new PhanSo(this.tuSo / ucln, this.mauSo / ucln);
    }

    private int timUCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a * b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

    @Override
    public String toString() {
        return "PhanSo{" +
                "tuSo=" + tuSo +
                ", mauSo=" + mauSo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhanSo phanSo = (PhanSo) o;
        return tuSo == phanSo.tuSo && mauSo == phanSo.mauSo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tuSo, mauSo);
    }
}