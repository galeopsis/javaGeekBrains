package ru.geekbrains.homework2;

public class HomeWork2 {

    public static void main(String[] args) {
        test(-45654);
        test(654);
        test(-54);
        test(-45654);
    }

    private static void test(int i) {
        String word = (i > 0) ? ("положительное!") : ("отрицательное!");
        System.out.printf("Число %d %s %n", i, word);
    }
}