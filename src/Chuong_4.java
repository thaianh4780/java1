import java.io.*;

public class Chuong_4 {
    public static void main(String[] args) {
//        write("copy1");
//        read("copy1");
        try {
            copy("copy1", "abc2");
        } catch (IOException ex) {
            System.out.println("chongu2" + ex);
        }

        read("abc2");
    }

    public static void write(String fileName) {
        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("dmm");
            fileWriter.write("\ndcmm");
            fileWriter.close();
            System.out.println("Done Writing");
        } catch (IOException ex) {
            System.out.println("loi ghi tap tin" + ex);
        }
    }

    public static void read(String fileName) {
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
            System.out.println("Done Reading");
        } catch (IOException ex) {
            System.out.println("loi doc file" + ex);
        }
    }


    public static void copy(String sourceName, String destName) throws
            IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream(sourceName);
            outputStream = new FileOutputStream(destName);

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
            System.out.println("sao chep thanh cong");
        } finally {
            if (inputStream != null) {
                inputStream.close();
                System.out.println("ko co file");
            }
            if (outputStream != null) {
                outputStream.close();
                System.out.println("ko co file");
            }
        }
    }
}
