import java.util.*;

public class Chuong2 {

    public static void main(String[] args) {

        //bai 1

        //bai 2

        //bai 3

        //bai 4

        //bai 5

        //bai 6

        //bai 7

        //bai 8

        //bai 9

        //bai 10

        //bai 11

        //bai 12

    }

    //bai 1
    public static String tinhBangCuuChuong(int a) {
        String b = "";
        if (a >= 1 | a < 9) {
            for (a = 1; a < 10; a++) { // cau b
                for (int i = 1; i <= 10; i++) {
                    b += (i + " * " + a + " = " + i * a + " | ");
                }
                b += "\n";
            }
        }
        return b;
    }

    //bai 2
    public static String xoaSpace(String strings) {
        strings = strings.replace(" +", "").trim();

        return strings;
    }

    public static String layChuDau(String strings) {
        String[] str = xoaSpace(strings).split(" ");
        String result = "";

        for (int i = 0; i < str.length; i++) {
            result += str[i].charAt(0);
        }

        result = result.toUpperCase();

        return result;
    }

    //bai 3
    public static int tinhTongDaySo(int a) {
        int c = 0;
        String b = "";
        String d = "";
        int i = (a % 2 == 0) ? 2 : 1;
        for (; i <= a; i += 2) {
            b += i + " ";
            c = c + i;
        }
//        d = b +"\n"+ c ;
//        return d;
        return c;
    }

    //bai 4
    public static String chuyenThapPhanSangNhiPhan(int dec) {
        String bin = "";

        while (dec > 0) {
            bin = (dec % 2) + bin;
            dec /= 2;
        }

        return bin;
    }

    public static String chuyenThapPhanSangThapLucPhan(int dec) {
        String hex = "";

        hex = Integer.toHexString(dec);

        return hex;
    }

    public static String chuyenThapPhanSangBatPhan(int dec) {
        String oct = "";

        for (int i = dec; i > 0; i /= 8) {
            oct = (i % 8) + oct;
        }

        return oct;
    }

    public static void inBangBiOxHe() {
        String a = "";
        for (int i = 1; i < 256; i++) {
            System.out.println("");
            System.out.println("10 : " + i);
            System.out.println(" 2 : " + chuyenThapPhanSangNhiPhan(i));
            System.out.println(" 8 : " + chuyenThapPhanSangBatPhan(i));
            System.out.println(" 16 : " + chuyenThapPhanSangThapLucPhan(i));
        }
    }

    //bai 5
    public static int laySoNgauNhienGiua2So(int min, int max) {
        int result;
        Random rand = new Random();

        result = rand.nextInt((max - min) + 1) + min;

        return result;
    }

    //bai 6
    public static String chuyenDoiSoThanhChu(int decimalNum) {
        String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "L", "C", "D", "M"};
        int[] decimalValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 50, 100, 500, 1000};
        String romanNum = "";

        for (int i = decimalValues.length - 1; i >= 0; i--) {
            int quotient = decimalNum / decimalValues[i];
            decimalNum %= decimalValues[i];
            while (quotient > 0) {
                romanNum += romanNumerals[i];
                quotient--;
            }
        }

        return romanNum;
    }

    public static int chuyenChuThanhSo(String romanNum) {
        Map<Character, Integer> romanValues = new HashMap<Character, Integer>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int decimalNum = 0;
        int prevValue = 0;

        for (int i = romanNum.length() - 1; i >= 0; i--) {
            int curValue = romanValues.get(romanNum.charAt(i));
            if (curValue < prevValue) {
                decimalNum -= curValue;
            } else {
                decimalNum += curValue;
            }
            prevValue = curValue;
        }

        return decimalNum;
    }

    //bai 7
    public static int tinhTuoi(int namSinh) {
        int year, result = 0;
        Calendar c = Calendar.getInstance();

        year = c.get(Calendar.YEAR);
        result = year - namSinh;

        return result;
    }

    public static String tinhAmLich(int tuoi) {
        String[] namChi = {"Tý", "Sửu", "Dần", "Mão", "Thìn", "Tị", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi"};
        String[] namCan = {"Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ", "Canh", "Tân", "Nhâm", "Quý"};
        String tonLui = "";

        int checkTuoiChi = (tuoi >= 2000) ? ((tuoi % 100) + 4) : (tuoi % 100);
        int tinhChi = checkTuoiChi % 12;
        int tuoiCan = (tuoi >= 2000) ? ((tuoi % 100) + 6) : (tuoi % 100);
        tonLui = namCan[tuoiCan] + " " + namChi[(tinhChi)];

        return tonLui;
    }

    public static String tinhTuoiAm(int tuoi) {
        String ketqua = "";

        ketqua += "Năm nay bạn: " + tinhTuoi(tuoi) + " tuổi, bạn tuổi: " + tinhAmLich(tuoi);

        return ketqua;
    }

    //bai 8
    public static void tinhToan10() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean dung;
        int num1, num2, cauTraLoi, ngDungTraLoi;

        String[] ketQuaDung = {
                "Good job!",
                "Well done!",
                "Keep it up!"
        };

        String[] ketquaSai = {
                "Oops, try again!",
                "Not quite right, keep practicing!",
                "Don't worry, you'll get it next time!"
        };

        while (true) {
            // Generate two random numbers between 1 and 10
            do {
                num1 = rand.nextInt(10);
                num2 = rand.nextInt(10);
            } while (num1 + num2 != 10);

            // Calculate the correct cauTraLoi
            cauTraLoi = num1 + num2;

            // Ask the user to input their cauTraLoi
            System.out.println("What is " + num1 + " + " + num2 + "?");
            ngDungTraLoi = scanner.nextInt();

            // Check if the user's cauTraLoi is correct
            dung = ngDungTraLoi == cauTraLoi;

            // Output a random response based on if the cauTraLoi is correct or not
            if (dung) {
                System.out.println(ketQuaDung[rand.nextInt(ketQuaDung.length)]);
            } else {
                System.out.println(ketquaSai[rand.nextInt(ketquaSai.length)]);
            }

            // Ask the user if they want to continue or exit
            System.out.println("Do you want to continue? (Y/N)");
            String luaChon = scanner.next();

            // Check if the user wants to exit
            if (luaChon.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}

