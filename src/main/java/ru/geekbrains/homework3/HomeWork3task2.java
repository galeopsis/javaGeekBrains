package ru.geekbrains.homework3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3task2 {
    public static void main(String[] args) {
        //Task #2

        System.out.println("Task #2: ");

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        askWord(words);
    }

    private static void askWord(String[] words) {
        System.out.println(Arrays.toString(words));
        int wordsIndex = (int) (Math.random() * words.length);
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println(words[wordsIndex]);
            System.out.println("Угадайте слово: ");
            String answer = in.nextLine();
            System.out.println(answer);
            if(answer.equals(words[wordsIndex])){
                System.out.println("Вы угадали!");
                break;
            }
        }
    }
}
