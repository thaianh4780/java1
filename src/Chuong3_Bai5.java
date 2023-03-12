import java.util.Random;
import java.util.Scanner;

public class Chuong3_Bai5 {
    public static void main(String[] args) {
        // khởi tạo mảng 50 số nguyên ngẫu nhiên
        int[] arr = new int[50];
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arr[i] = random.nextInt(100) + 1;
        }

        // lấy chỉ số từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chỉ số: ");
        int index = scanner.nextInt();

        // kiểm tra xem chỉ số có nằm trong phạm vi của mảng hay không
        if (index >= 0 && index < arr.length) {
            // in ra giá trị của phần tử tại chỉ số đó
            System.out.println("Giá trị của phần tử tại chỉ số " + index + " là " + arr[index]);
        } else {
            // in ra thông báo nếu chỉ số vượt quá phạm vi của mảng
            System.out.println("Vượt chỉ số mảng");
        }
    }
}
