package bai2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Bai2 {

    public static void main(String[] args) {
        doc_In_File("copy1");
    }

    //doc file
    public static void doc_In_File(String fileName) {
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                 System.out.println(tinhTBC(line));
            }
        } catch (IOException ex) {
            System.out.println("Loi doc file" + ex);
        }
    }

    public static String xoaSpace(String strings) {
        strings = strings.replace(" +", "").trim();

        return strings;
    }

    public static String tinhTBC(String strings) {
        String[] str = xoaSpace(strings).split(" ");
        String result = "";
        int sum = 0;
        int[] intArray = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            intArray[i] = Integer.parseInt(str[i]); // chuyển đổi từng phần tử String thành int
        }
        for (int i = 1; i <= intArray.length; i++) {
            sum += i ;
        }

        result = "tong: " + sum + " tbc: "+ (sum / intArray.length) ;

        return result;
    }
}
