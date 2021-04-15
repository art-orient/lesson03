package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        int start;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nПривет! Загадай число от 0 до 100. А я попробую его угадать...");
        do {
            System.out.println("Если загадал - нажми цифру 5");
            start = scanner.nextInt();
        } while (start !=5);
        int answer;
        int maxNumber = 100;
        int minNumber = 0;
        do {
            System.out.println("Может, ты загадал число " + number + "?");
            System.out.println("Если я угадал - нажми цифру 5");
            System.out.println("Если твое число меньше " + number + " - нажми цифру 1, а если больше - нажми цифру 2");
            answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    maxNumber = number;
                    number = minNumber + (number - minNumber)/ 2;
                    break;
                case 2:
                    minNumber = number;
                    number += (maxNumber - number)/ 2;
                    break;
                case 5:
                    System.out.println("Поздравляю! У нас получилось отгадать число!");
                    break;
            }
        } while (answer != 5);
    }
}
