package bai3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Bai3 {

    public static void main(String[] args) {
        ghiFile("test12");
//        String[] arr = {"5", "2", " 9", "1", " 5", "6"};
//        sapXep("arr");
    }

    public static void ghiFile(String fileName) {
        try {
            Random rand = new Random();
            File file = new File(fileName);
            String result = "";

            if (file.exists()) {
                file.createNewFile();
            }

            FileWriter fileWriter = new FileWriter(file);

            for (int i = 0; i < 10; i++) {
                int num1 = rand.nextInt(101);
                result += num1 + " "; // địt con moe m dấu cộng dmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm
            }

            System.out.print(result);
            fileWriter.write(result);
            fileWriter.close();
            System.out.println("Done Writing");

            System.out.println( "Ket qua sap xep: "+ sapXep(result));

        } catch (IOException ex) {
            System.out.println("ko co file " + ex);
        }
    }

    public static String sapXep(String strings) {
        String[] str = strings.split(" ");
        String result = "";

        int[] intArray = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            intArray[i] = Integer.parseInt(str[i]); // chuyển đổi từng phần tử String thành int
        }
        Arrays.sort(intArray);
        result = Arrays.toString(intArray);

        return result;
    }
}
