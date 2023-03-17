package bai5;

import java.io.*;

public class Bai5 {

    public static void main(String[] args) {

        String fileText = "NumText.txt";
        String fileDAT = "NumBin.dat";

        try {
            String[] numbers = docFile(fileText);

            writeNumbersToBinaryFile(fileDAT, numbers);

            hienKichThuoc(fileText, fileDAT);

            hienSoFileDAT(fileDAT);
        } catch (IOException ex) {
            System.out.println("ko dung file " + ex);
        }
    }

    public static String[] docFile(String fileText) throws IOException {
        FileReader fr = new FileReader(fileText);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        String[] numbers = line.split(" ");

        br.close();
        fr.close();

        return numbers;
    }

    public static void writeNumbersToBinaryFile(String fileDAT, String[] numbers) {
        try {
            FileOutputStream fos = new FileOutputStream(fileDAT);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);

            for (String number : numbers) {
                dos.writeInt(Integer.parseInt(number));
            }

            dos.close();
            bos.close();
            fos.close();

        } catch (IOException ex) {
            System.out.println("Loi ko ghi dc file DAT " + ex);
        }
    }

    public static void hienKichThuoc(String fileText, String fileDAT) {
        File textFile = new File(fileText);

        System.out.println("Kích thước của file text: " + textFile.length() + " bytes");

        File binFile = new File(fileDAT);

        System.out.println("Kích thước của file nhị phân: " + binFile.length() + " bytes");
    }

    public static void hienSoFileDAT(String fileDAT) {
        try {
            FileInputStream fis = new FileInputStream(fileDAT);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);

            System.out.print("Các số nguyên trong file nhị phân: ");
            while (dis.available() > 0) {
                System.out.print(dis.readInt() + " ");
            }

            dis.close();
            bis.close();
            fis.close();

        } catch (IOException ex) {
            System.out.println("Loi ko hien thi so tu file DAT " + ex);
        }
    }
}
