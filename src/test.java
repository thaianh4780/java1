public class test {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(25,5);
        PhanSo ps2 = new PhanSo(10,54);
        PhanSo ps3 = new PhanSo(10,54);

        System.out.println(ps2.getMauSo()) ;
        System.out.println(ps1.getTuSo());

        PhanSo phanSo = new PhanSo(30,25);
        int tuSo = phanSo.getTuSo();
        System.out.println(tuSo);

        System.out.println( ps2.cong(ps1 ));
        System.out.println(ps3.equals( ps2) );
    }
}
