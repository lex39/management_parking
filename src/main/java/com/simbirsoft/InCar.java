package com.simbirsoft;

import java.util.Scanner;

public class InCar {

    public static void menuInCar() {
        while (true) {
            System.out.println();
            System.out.println("1. Ввести номер въезжающего автомобиля");
            System.out.println("2. Выход");
            Scanner input = new Scanner(System.in);
            int command = input.nextInt();
            if (command == 1) {
                CarNumber.getCarNumber();
            } else if (command == 2) {
                break;
            } else {
                System.out.println("Не понял команды. Повторите.");
            }
        }
    }

}
