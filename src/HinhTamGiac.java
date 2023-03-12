public class HinhTamGiac {
    private int canh1;
    private int canh2;
    private int canh3;

    @Override
    public String toString() {
        return "HinhTamGiac{" +
                "canh1=" + canh1 +
                ", canh2=" + canh2 +
                ", canh3=" + canh3 +
                '}';
    }

//    public HinhTamGiac(int canh1, int canh2, int canh3) {
//        this.canh1 = canh1;
//        this.canh2 = canh2;
//        this.canh3 = canh3;
//    }

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh2 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh3 = canh3;
    }

    public HinhTamGiac(int a, int b, int c) throws IllegalTriangleException {

        if (canh1 + canh2 <= canh3| canh1+ canh3 <= canh2| canh2+canh3<=canh1 ) {
            throw new IllegalTriangleException("nhap vao canh sai");
        }
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;

    }
}

