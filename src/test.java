public class test {
    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(5,2);
        PhanSo ps2 = new PhanSo(6,4);

        System.out.println(ps2.congPhanSo(ps1));
        System.out.println(ps2.truPhanSo(ps1));
        System.out.println(ps2.nhanPhanSo(ps1));
        System.out.println(ps2.chiaPhanSo(ps1));



    }
}
