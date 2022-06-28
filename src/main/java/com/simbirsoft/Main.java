package com.simbirsoft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Парковщик - программа учета автомобилей на парковке");

        while (true) {

            System.out.println("Автомобиль вьезжает или выезжает с парковки?");
            System.out.println("1. Вьезжает");
            System.out.println("2. Выезжает");
            System.out.println("3. Выход");

            Scanner input = new Scanner(System.in);
            int command = input.nextInt();
            if (command == 1) {
                InCar.menuInCar();
            } else if (command == 2) {

            } else if (command == 3) {
                break;
            } else {
                System.out.println("Не понял команды. Повторите.");
            }
        }
    }
}
