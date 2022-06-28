package com.simbirsoft;

import java.util.Locale;
import java.util.Scanner;

public class CarNumber {

    static String[] arrCarNumber = new String[3];

    public static void getCarNumber() {
        System.out.println("ПРИМЕР: А123БС39");
        System.out.print("ВВЕДИЕТ НОМЕР:");
        Scanner input = new Scanner(System.in);
        //String inCarNumber = input.next();

        for (int i = 0; i < arrCarNumber.length; i++) {
            String inCarNumber = input.next();
            if (arrCarNumber[i] == null) {
                arrCarNumber[i] = inCarNumber.toUpperCase(Locale.ROOT);
                break;
            } else {
                break;
            }
        }
        for (int i = 0; i < arrCarNumber.length; i++) {
            System.out.println(arrCarNumber[i]);
        }
    }
}

