package Bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HinhTron {
    public static List<HinhTron> list = new ArrayList<>();

    public HinhTron(int banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
        Random random = new Random();
        this.banKinh = random.nextInt(41) + 10;
        list.add(this);
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh() {
        this.banKinh = banKinh;

    }

    private double banKinh;


    public double getArea() {

        return Math.PI * banKinh * banKinh;
    }

    public double getPerimeter() {
        return 2 * Math.PI * banKinh;
    }

    public static double tinhDienTichTrungBinh() {
        double result = 0;
        int count = 0;
        double lastResult = 0 ;

        for (HinhTron hinhTron : list) {
            result += (hinhTron.getArea());
            count++;
        }
        lastResult = result/count ;
        return lastResult;
    }

    public static  List<HinhTron> xapXepSTang (List<HinhTron>list){

    }


    @Override
    public String toString() {
        return "Circle with radius " + banKinh + ", area " + getArea() + ", perimeter " + getPerimeter();
    }


}
