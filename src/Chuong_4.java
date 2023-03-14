import java.io.*;

public class Chuong_4 {
    public static void main(String[] args) {
        write("pdf");
        read("pdf");

    }

    public  static  void  write(String fileName){
        try {
            File file = new File(fileName);
            FileWriter fileWriter = new FileWriter(file) ;

            fileWriter.write("dmm");
            fileWriter.write("\ndcmm");
            fileWriter.close();
            System.out.println("Done Writing");
        } catch (IOException ex){
            System.out.println("loi ghi tap tin" + ex );
        }
    }

    public static void read(String fileName){
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            while ((line = bufferedReader.readLine()) !=null ){
                System.out.println(line);
            }

            bufferedReader.close();
            fileReader.close();
            System.out.println("Done Reading");
        }catch (IOException ex){
            System.out.println("loi doc file" + ex);
        }
    }

    public static  void  copy(String fileName1 , String fileName2 ){
        FileReader fileReader = null ;
        FileWriter fileWriter = null ;

        try{
            fileReader = new FileReader(fileName1);
            fileWriter = new FileWriter(fileName2);

            int lap;
            for ( (int c = in.read(); c != -1; c = in.read()){
                fileWriter.write(lap);
            }
        }
    }
}
