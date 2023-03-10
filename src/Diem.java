public class Diem {
    private int hoanhDo;

    private int tungHo;

    public Diem(int hoanhDo, int tungHo) {
        this.hoanhDo = hoanhDo;
        this.tungHo = tungHo;
    }

    public void setHoanhDo(int hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public void setTungHo(int tungHo) {
        this.tungHo = tungHo;
    }

    public int getHoanhDo() {
        return hoanhDo;
    }

    public int getTungHo() {
        return tungHo;
    }

    @Override
    public String toString() {
        return "Diem{" +
                "hoanhDo=" + hoanhDo +
                ", tungHo=" + tungHo +
                '}';
    }

    public double tinhKhoangCachGoc(int hoanhDo, int tungHo) {
        double result, cal;

        cal = (hoanhDo * hoanhDo) + (tungHo * tungHo);
        result = Math.sqrt(cal);

        return result;
    }

    public double tinhKhoangCachDiem(Diem d) {
        double result, cal;

        cal = Math.pow((this.hoanhDo -d.hoanhDo),2) -Math.pow((this.tungHo -d.tungHo),2) ;
        result = Math.sqrt(cal);

        return result ;
    }
}
