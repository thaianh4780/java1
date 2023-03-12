import java.util.Scanner;

public class Chuong3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.print("Enter dividend: ");
//        int dividend = scanner.nextInt();
//
//        System.out.print("Enter divisor: ");
//        int divisor = scanner.nextInt();
//
//        try {
//            int quotient = dividend / divisor;
//            System.out.println("Result: " + quotient);
//        } catch (ArithmeticException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

        int dividend = 10;
        int divisor = 0;

        int quotient = divide(dividend, divisor);
        System.out.println("Result: " + quotient);

//        try {
//            int quotient1 = divide(dividend, divisor);
//            System.out.println("Result: " + quotient1);
//        } catch (ArithmeticException e) {
//            System.out.println("Error: " + e.getMessage());
//        }

//        try {
//            int a = 8;
//            int b = 0;
//            int c = a / b;
//
//            int[] arr = {5, 10};
//            arr[2] = 15;
//
//            System.out.println(c);
//        } catch (ArithmeticException ae) {
//            System.out.println("Lỗi chia cho 0: " + ae);
//        } catch (Exception e) {
//            System.out.println("Lỗi khác: " + e);
//        }finally {
//            System.out.println("always finally");
//        }
//
//        chiaSo(2,0);
        int tuSo = 0;
        int mauSo = 0;

        while (true) {
            try {
                System.out.print("Enter tuSo: ");
                tuSo = Integer.parseInt(input.nextLine());
                System.out.print("Enter mauSo: ");
                mauSo = Integer.parseInt(input.nextLine());

                if (mauSo == 0) {
                    throw new ArithmeticException("dell co chia cho 0 ");
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("nhap ngu");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }

        int ucln = UCLN(tuSo, mauSo);
        int tuSoToiGian = tuSo / ucln;
        int mauSoToiGian = mauSo / ucln;

        System.out.println("Reduced fraction: " + tuSoToiGian + "/" + mauSoToiGian);
        System.out.println("Result of division: " + (double)tuSo / mauSo);
    }

//    bai 3
    public static int UCLN(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }

        return UCLN(num2, num1 % num2);
    }



    //    public static int chiaSo(int a, int b) throws ArithmeticException {
//         if (b == 0) {
//             throw new ArithmeticException("Lỗi chia cho không");
//             } else {
//             return a / b;
//             }
//        }
    public static void chiaSo(int num1, int num2) {
        int result = 0;
        String text = " loi chia 0";
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println(text);
        }
    }

    //bai 2
    public static int divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero.");
        }

        return dividend / divisor;
    }


}
