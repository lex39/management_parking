package com.simbirsoft;

import java.util.Scanner;

public class OutCar {

    public static void menuOutCar() {
        while (true) {
            System.out.println();
            System.out.println("1. Ввести номер выезжающего автомобиля (ПРИМЕР - А123БС39)");
            System.out.println("2. Выход");
            Scanner input = new Scanner(System.in);
            int command = input.nextInt();
            if (command == 1) {

            } else if (command == 2) {
                break;
            } else {
                System.out.println("Не понял команды. Повторите.");
            }
        }
    }
}
