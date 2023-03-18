package Bai2;

import java.util.*;

;

public class Main {
    public static void main(String[] args) {
        List<HinhTron> circles = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
//            int radius = random.nextInt(41) + 10; // Sinh số ngẫu nhiên từ 10 đến 50
            HinhTron circle = new HinhTron();
            circles.add(circle);
        }

//        circles.forEach(System.out::println);

//        for (HinhTron circle : circles) {
        HinhTron.tinhDienTichTrungBinh();
//        }


        Collections.sort(circles, new Comparator<HinhTron>() {
            @Override
            public int compare(HinhTron e1, HinhTron e2) {

                return Double.compare(e1.getArea(), e2.getArea());
            }
        });

        for (HinhTron circle : circles) {
            System.out.println(circle);
        }

    }
}
