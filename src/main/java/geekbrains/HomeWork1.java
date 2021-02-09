package geekbrains;

import java.util.Scanner;

public class HomeWork1 {

    //Task #1
    public static void main(String[] args) {

        //Task #2
        byte valByte = -94;
        short valShort = 15656;
        int valInt = 474836;
        long valLong = 22337203685477L;
        float valFloat = 747.544f;
        double valDouble = 61212777221.669744;
        char valChar = 'S';
        boolean valBoolean = true;

        //Task #3
        System.out.println(expr(14, 22, 9, 44));

        //Task #4
        System.out.println(summ (1, 21));

        //Task #5
        System.out.println(result(48));


        //Task #6
        System.out.println(isNegative(-55));

        //Task #7
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.printf("Привет, %s \n", name + "!");
        in.close();

        //Task #8
        System.out.println(isLeapYear(2020));
    }
    public static int expr(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean summ(int a, int b) {
        int result = a + b;
        if (result > 10 && result < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNegative(int i) {
        int number = i;
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static String result(int r) {
        String result;
        if (r >= 0) {
            result = "Ваше число положительное!";
            return result;
        } else {
            result = "Ваше число отрицательное!";
            return result;
        }
    }
    public static String isLeapYear(int y) {
        String isLeapYear;
        if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0)) {
            isLeapYear = "является високосным!";
            return isLeapYear;
        } else {
            isLeapYear = "не является високосным!";
            return isLeapYear;
        }
    }
}

