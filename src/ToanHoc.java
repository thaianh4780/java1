import java.util.Scanner;

public class ToanHoc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Nhap a :");
//        int a = input.nextInt();
//        System.out.println("Nhap b :");
//        int b = input.nextInt();
//        int tong = a + b;
//        int tich = a * b;
////        System.out.println("c = a + b : " + (a + b));
////        System.out.println("d = a + b : " + a + b);
//        System.out.println("Tong 2 so " + a + " va " + b + " la: " + tong);
//        System.out.println("Tich 2 so " + a + " va " + b + " la: " + tich);
//
////        bai` 1
//        System.out.println("a journey of thousand miles begins with a single step");
//
////        bai` 3
//        System.out.println("Nhap dime ten m vao` conchoangu lay`: ");
//        String hoTen = input.nextLine();
//        System.out.println("Kimi no namae wa: " + hoTen);
//
////        bai` 4
//        System.out.println("Nhap a :");
//        int d = input.nextInt();
//        System.out.println("Nhap b :");
//        int f = input.nextInt();
//        int chuVi = d + f;
//        int dienTich = d * f;
////        System.out.println("c = a + b : " + (a + b));
////        System.out.println("d = a + b : " + a + b);
//        System.out.println("Chu vi cua 2 canh " + d + " va " + f + " la: " + chuVi);
//        System.out.println("Dien tich cua 2 canh " + d + " va " + f + " la: " + dienTich);
//
////        bai` 5
//        System.out.println("Nhap so giay :");
//        int e = input.nextInt();
//        int g = e / 60; //phut
//        int h = g / 60; // gio
//        int i = (e - (h * 3600)) / 60;
//        int h1 = (e - (h * 3600) - (i * 60));
//        System.out.println(h + ":" + i + ":" + h1);

//       btvn
//        System.out.println("Nhap so hs :");
//        int j = input.nextInt();
//        int k =  j/1440; // sothung
//        int l = (j%1440)/60; // so hop
//        int m = ((j%1440)%60)/6; // so vi
//        int n = ((j%1440)%60)%6; // so vien
//        System.out.println("can`: " + k + " thung, "+l+" hop, "+m+" vi, "+n+" vien." );

////        bai 6
//        System.out.println("chon do F or C");
//        String p = input.nextLine();
//        System.out.println("Nhap do :");
//        double o = input.nextDouble();
//        if (p.equals("F") | p.equals("f")) {
//            System.out.println("From F: " + o + " to C : "+( (9/5)*o + 32));
//        }else
//        if (p.equals("C") | p.equals("c")) {
//            System.out.println("From C: " + o + " to F : "+( (5/9)*(o-32)));
//        }
//        else {
//            System.out.println("Chi dc nhap F or C ! \nVui long nhap lai");
//        }

//        bai` 7
        System.out.println("Chon 1 trong 2: \n 1 : Kg,M \n 2 : P,I");
        String q = input.nextLine();
        System.out.println("Nhap chieu cao :");
        double r = input.nextDouble();
        System.out.println("Nhap cang nang :");
        double x = input.nextDouble();
        double y = 0;
        if ( q.equals("1")) {
            y =x/(r*r) ;
            if (y < 18.5){
                System.out.println("Underweight");
            }
            if (18.5 >= y|| y <= 24.9) {
                System.out.println("Normal");
            }
            if (25 >= y|| y <= 29.9) {
                System.out.println("Overweight");
            }else {
                System.out.println("Obese");
            }
            System.out.println("BMI (kg, M): " + y );
        } else if ( q.equals("2")) {
            y =(x*103)/(r*r) ;
            if (y < 18.5){
                System.out.println("Underweight");
            }
            if (18.5 >= y|| y <= 24.9) {
                System.out.println("Normal");
            }
            if (25 >= y|| y <= 29.9) {
                System.out.println("Overweight");
            }else {
                System.out.println("Obese");
            }
            System.out.println("BMI (P, I): " + y );
        } else {
            System.out.println("Co' hiu tieng ng ko ?");
        }
    }
}
