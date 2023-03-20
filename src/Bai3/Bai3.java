package Bai3;

import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String input = scanner.nextLine();
        List<CharPosition> charPositions = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) { //chay ko trc r moi toi co
            char c = input.charAt(i);
            boolean found = false;

            for (CharPosition cp : charPositions) {
                if (cp.getKiTu() == c) {
                    cp.addPosition(i);
                    System.out.println(" i : "+ i);
                    System.out.println("cp : "+cp);
                    found = true;
                    break;
                }
            }
            if (!found) {
                CharPosition cp = new CharPosition(i, c);
                charPositions.add(cp);
            }
        }

        for (CharPosition cp : charPositions) {
            System.out.println(cp);
        }
    }
}


