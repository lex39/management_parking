package com.simbirsoft;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class CarNumber {

    static String[] arrCarNumber = new String[3];

    public static String getCarNumber() {

        Scanner input = new Scanner(System.in);
        String inCarNumber = input.next();

        for (int i = 0; i < arrCarNumber.length; i++) {
            if (arrCarNumber[i] == null) {
                arrCarNumber[i] = inCarNumber.toUpperCase(Locale.ROOT);
                System.out.println();
                System.out.println("************");
                System.out.println("Траспортное средство с номером " + inCarNumber + " припарковано в ячейку: " +
                        Arrays.asList(arrCarNumber).indexOf(arrCarNumber[i + 1]));
                break;
            }
            if (i == arrCarNumber.length-1) {
                System.out.println("Все парковочные места заняты!");
            }
        }
        return inCarNumber;
    }
}

