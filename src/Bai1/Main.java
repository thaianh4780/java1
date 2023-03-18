package Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<NhanVien> employees = new ArrayList<>();
        employees.add(new NhanVien(1, "Nguyen Van A", 100000000));
        employees.add(new NhanVien(2, "Tran Thi B", 50000000));
        employees.add(new NhanVien(3, "Le Van C", 80000000));
        employees.add(new NhanVien(4, "Pham Thi D", 120000000));

        Collections.sort(employees, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien e1, NhanVien e2) {

                return Double.compare(e2.getDoanhThu(), e1.getDoanhThu());
            }
        });

        for (NhanVien employee : employees) {
            employee.displayInfo();
        }
    }
}

