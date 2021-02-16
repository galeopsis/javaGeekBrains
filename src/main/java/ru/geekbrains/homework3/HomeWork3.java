package ru.geekbrains.homework3;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        //Task #1
        System.out.println("Task #1: ");
        int secret = (int) (Math.random() * 10);
        askSecret(secret);
    }

    private static void askSecret(int secret) {
        int attempts = 3;
        Scanner in = new Scanner(System.in);

        while (true) {
            if (attempts == 0) {
                System.out.print("Вы проиграли! ");
                System.out.print("Хотите сыграть снова? 1 = Да, Любое другое число = Нет ");
                if (in.nextInt() == 1) {
                    secret = (int) (Math.random() * 10);
                    System.out.println(secret);
                    askSecret(secret);
                }
                break;
            }
            System.out.print("Угадайте число от 0 до 10: ");
            int answer = in.nextInt();
            attempts--;
            if (answer == secret) {
                System.out.print("Поздравляю, Вы угадали! ");
                System.out.print("Хотите сыграть снова? 1 = Да, Любое другое число = Нет ");
                if (in.nextInt() == 1) {
                    secret = (int) (Math.random() * 10);
                    System.out.println(secret);
                    askSecret(secret);
                }
                break;
            }
            if (answer < secret) {
                System.out.println("Ваш ответ слишком маленький. ");
            } else if (answer > secret) {
                System.out.println("Ваш ответ слишком большой. ");
            } else {
                break;
            }
        }
    }

}






