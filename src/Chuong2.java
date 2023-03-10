import java.util.Scanner;

public class Chuong2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//         try catch dùng để control code lỗi , cụ thể là check lỗi hệ thống

//         có 4 loại lỗi :
//         BUG: Là lỗi trong một module hoặc hệ thống mà nó không thực hiện đúng chức năng như yêu cầu.
//         DEFECT: Lỗi trong quá trình phát triển (coding) hoặc lỗi logic làm cho chương trình hoạt động sai yêu cầu đề ra.
//         ERROR: Là hành động của con người dẫn đến kết quả sai.
//         FAILURE chính là sự khác biệt giữa kết quả thực tế trên màn hình và kết quả mong đợi của một function, hệ thống hoặc service nào đó.
//
//         and :  so sánh 2 dãy nhị phân của 1 số:
//              NẾU  2 bit khác nhau (0 và 1 ) => 0
//              NẾU 2 bit giống nhau => (1 & 1 -> 1 ;  0 & 0 -> 0)
//              ví dụ : 30 ( 30 = (1 * 2^4) + (1 * 2^3) + (1 * 2^2) + (1 * 2^1) + (0 * 2^0) ) => 11110
//                      10 (10 = (0 * 2^0) + (1 * 2^1) + (0 * 2^2 ) + (1 * 2^3) + (0 * 2^4) ) => 01010
/*             xét : hàng t1 : 1 vs 0 => khác => ko lấy => 0
*                    hàng t2 : 1 vs 1 => giống => lấy => 1
*                    hàng t3 : 1 vs 0 => khác => ko lấy => 0
*                    hàng t4 : 1 vs 1 => giống => lấy => 1
*                    hàng t5 : 0 vs 0 => giống => lấy => 0
*                  => kết quả : 01010 = 10
*
*           or : NẾU  2 bit khác nhau (0 và 1 ) => 1
//               NẾU 2 bit giống nhau => (1 & 1 -> 1 ;  0 & 0 -> 0)
*              xét : hàng t1 : 1 vs 0 => khác => lấy => 1
*                    hàng t2 : 1 vs 1 => giống => lấy => 1
*                    hàng t3 : 1 vs 0 => khác => lấy => 1
*                    hàng t4 : 1 vs 1 => giống => lấy => 1
*                    hàng t5 : 0 vs 0 => giống => lấy => 0
*                  => kết quả : 11110 = 30
*
*          xor:  NẾU  2 bit khác nhau (0 và 1 ) => 1
//               NẾU 2 bit giống nhau => (1 & 1 -> 0 ;  0 & 0 -> 0)
*                   xét : hàng t1 : 1 vs 0 => khác => lấy => 1
*                         hàng t2 : 1 vs 1 => giống => ko lấy => 0
*                         hàng t3 : 1 vs 0 => khác => lấy => 1
*                         hàng t4 : 1 vs 1 => giống => ko lấy => 0
*                         hàng t5 : 0 vs 0 => giống => ko lấy => 0
*                  => kết quả : 10100 = 20
*                                                                             */
//        try {
//            int a = 1 / 0;
//            String s1 = "1";
//            int num1 = Integer.parseInt(s1);
//            System.out.println(num1);
////
////            int x = Integer.parseInt("10");//Integer.valueOf(“10”)
////            float f = Float.parseFloat("4.5");
////            boolean b = Boolean.parseBoolean("true");
//        } catch (Exception ex) {
//            System.out.println("Dữ liệu không hợp lệ!");
//        }


////        test switch case
//        System.out.println("nhap ten");
//        String a = input.nextLine() ;
//        switch (a){
//            case "anh" :
//                System.out.println("nice");
//                break;
//            case "Anh":
//                System.out.println("not much"); break;
//            case "more ":
//                System.out.println("cut"); break;
//            default:
//                System.out.println("Err");
//        }

////      ham` check nhap vao` so nguyen
//        System.out.println("nhap so nguyen: ");
//        boolean check = false;
//        int n = 0;
//        while (!check) {
//            try {
//                n = input.nextInt();
//                check = true;
//            } catch (Exception e) {
//                System.out.println("Bạn phải nhập số nguyên! Vui l̀ong nhập lại...");
//                input.nextLine();// đọc hết dòng (để bỏ đi các ký tự thừa nếu có)
//            }
//        }
//        System.out.println(n);

////        test mang 1 chiu
//        int number[] = {1,2,3};
//        String[] car = {"BMW","Ford","Mazda"};
//        System.out.println( "car[0]" + car[0]);
//        car[0]="Mercedes";
//        car[2]="Toyota";
//        for (String i : car) {
//            System.out.println( "print all car:" + i);
//        }

////        test mang 2 chiu`
//        int[][] myNumbers =  { { 1, 2, 3, 4 }, { 5, 6 } , {7, 8, 9, 10, 11} }; // moi 1 {} la 1 mang
//        System.out.print( "my num :" + myNumbers.length); // => ham tren co 3 mang => .length = 3
//        try {
//            int x = myNumbers[2][4]; // lấy phần tử hàng thứ 3 , cột 5
//            System.out.println( "\nthe first item: " + x);
//        } catch (Exception e){
//            System.out.println("\ndmm");
//        }
//        for (int i = 0; i < myNumbers.length; i++) { // show ra het toan bo cac mang : cu the o day la 3
//            for (int j = 0; j < myNumbers[i].length; j++) { // show ra het phan tu trong 3 mang con
//                System.out.print( "item :" + myNumbers[i][j] +" " ); // in ra toan bo gia tri cua mang 2 chieu
//            }
//            System.out.println(); // cu moi khi i load het 1 mang , xuong dong
//        }
//
//        long n = 123456;
//        System.out.format("%d%n", n); // "123456"
//        System.out.format("%08d%n", n); // "00123456"
//        System.out.format("%+8d%n", n); // " +123456"
//        System.out.format("%,8d%n", n); // " 123,456"
//        System.out.format("%+,8d%n%n", n); // "+123,456"
//
//        double pi = Math.PI;
//
//        System.out.format("%f%n", pi); // "3.141593"
//        System.out.format("%.3f%n", pi); // "3.142"
//        System.out.format("%10.3f%n", pi); // " 3.142"
//        System.out.format("%-10.3f%n", pi); // "3.142"
//        System.out.format(Locale.FRANCE, "%-10.4f%n%n", pi); // "3,1416"
//
//        Calendar c = Calendar.getInstance();
//        System.out.format("%tB %te, %tY%n", c, c, c); // "Sep 03, 2018"
//
//        System.out.format("%tl:%tM %tp%n", c, c, c); // "7:55 am"
//
//        System.out.format("%tD%n", c); // "09/03/18"

//        HinhChuNhat hcn1 = new HinhChuNhat(6, 11);

////        bai` 1
////        System.out.println( "nhap vao a : ");
////        int a = input.nextInt();
////        String b = (a>=2 | a <= 9 ) ? "ngu" : "nice" ;
////        System.out.println( b);
////        if (a >= 1 | a<9) {
//        for (int a = 1; a < 10; a++) { // cau b
//            for (int i = 1; i <= 10; i++) {
//                System.out.print(i + " * " + a + " = " + i * a +" | ");
//            }
//            System.out.println(); // cau b
//        }
////        }else {
////            System.out.println("ngu");
////        }

////            bai 3
//        System.out.println("nhap vao b : ");
//        int b = input.nextInt();
//        int c = 0;
//        if (b % 2 == 1) {
//            for (int i = 1; i <= b; i += 2) {
//                if (i == b) {
//                    System.out.println(i);
//                    break;
//                }
//                System.out.print(i + " + ");
//                c += i;
//            }
//            System.out.println(c);
//        } else if (b % 2 == 0) {
//            for (int i = 2; i <= b; i += 2) {
//                if (i == b) {
//                    System.out.println(i);
//                    break;
//                }
//                System.out.print(i + " + ");
//                c += i;
//            }
//            System.out.println(c);
//        } else {
//            System.out.println(" ngôn vãi lù thề ");
//        }

//        int number[] = {1,2,3,4,5};
//        for (int i = 0; i < number.length; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }

//        //bai` 2
//        System.out.println("nhap vao` mang :");
////        String[] car = input.nextLine();
////        String abc = input.nextLine();
////        String[] tachChuoi = abc.split(" ");
////        for (int i = 0; i < tachChuoi.length; i++) {
////
////        }
//
//        String a = "cho aanh b23";
//        char[] listChar = a.toCharArray();
//        ArrayList<String> a1 = new ArrayList<>();
//        for (int i = 0; i < listChar.length; i++) {
//            if (listChar[i] == ' '){
//                a1.add(listChar[i+1]+"");
//            }
//        }
//
//        for (int i = 0; i < a1.toArray().length; i++) {
//            System.out.println(a1.toArray()[i]);
//        }
//        String[] array = new String[20];
//
//        Scanner s1 = new Scanner(System.in);
//
//        for (int i = 0; i < 20;i++){
//            array[i] = s1.nextLine();
//            System.out.println(array[i]);
//        }
//        System.out.println("Nhập vào chuỗi: ");
//        String inputString = input.nextLine();
//
//        // Tách các từ trong chuỗi đầu vào
//        String[] words = inputString.split(" ");
//
//        // Lấy ký tự đầu tiên của mỗi từ và lưu vào chuỗi kết quả
//        StringBuilder result = new StringBuilder();
//        for (String word : words) {
//            result.append(word.charAt(0));
//        }
//
//        // Chuyển chuỗi kết quả thành chữ hoa (nếu yêu cầu) và xuất ra màn hình
//        System.out.println(result.toString().toUpperCase());

// extra 3
//        System.out.println("nhap so");
//         int b = input.nextInt();
//        if (b != 0 ) {
//            if (b %2 ==1) {
//                System.out.println( (1+ b)*((b+1)/2)/2);
//            }else {
//                System.out.println( (2+b)*(b/2)/2);
//            }
//        }else {
//            System.out.println("cut");
//        }
//
//        System.out.println("nhap vao b : ");
//        int b = input.nextInt();
//        int c=0;
//        for (int i = 0; i <= b; i+=2) {
//            if (b != 0) {
//                if (b %2 ==0) {
//                    System.out.println(i+1);
//                    System.out.println( c+= (i+1));
//                }
//                else {
//                    System.out.println(i);
//                    System.out.println( c+= (i));
//
//                }
//            }else {
//                System.out.println("cut");
//            }

//    }

////        extra 3
//        System.out.println("nhap b"); // prints a message to the console
//        int b = input.nextInt(); // prompts the user to enter an integer value for b and stores it in the variable b
//        int i = (b%2 == 0) ? 2 : 1;
//        int c = 0 ;
//        for (; i <= b ; i+=2) {
//            System.out.println(i);
//            c = c + i ;
//        }
//        System.out.println(c);

//        // bai 4
//        for (int j = 1; j <= 256; j++) {
//            String c = "";
//            String d = "";
//            String e = "";
//            for (int i = j; i > 0; i /= 2) {
//                c = (i % 2) + c;
//            }
//            System.out.println( "2 :"+ j + " -> " + c);
//            for (int i = j; i > 0; i /= 8) {
//                d = (i % 8) + d;
//            }
//            System.out.println("8 :"+j + " -> " + d);
//            for (int i = j; i > 0; i /= 16) {
//                e = (i % 16) + e;
//            }
//            System.out.println("16 :"+j + " -> " + e);
//        }





























    }
}
