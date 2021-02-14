package ru.geekbrains.homework2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HomeWork2 {

    public static void main(String[] args) {

        final int SIZE = 8;

        //Task #1
        System.out.println("Task #1: ");

        int[] data = IntStream.range(0, SIZE).map(i -> (int) (Math.random() * 2)).toArray();
        System.out.println(Arrays.toString(data));
        for (int i = 0; i < data.length; i++) {
            data[i] = (data[i] == 0) ? 1 : 0;
        }
        System.out.println(Arrays.toString(data));

        //Task #2
        System.out.println("Task #2: ");

        int[] data_2 = new int[SIZE];
        int a = 0;
        for (int i = 0; i < data_2.length; i++) {
            data_2[i] = a;
            a += 3;
            System.out.printf("%3d ", data_2[i]);
        }
        System.out.println();

       /* Вариант Макса (для понимания процесса!)

        int[] data_2 = new int[SIZE];
        for (int i = 0 ; i < data_2.length; i++) {
            data_2[i] = i * 3;
            System.out.printf("%3d ", data_2[i]);
        }
        System.out.println();*/

        //Task #3
        System.out.println("Task #3: ");

        int[] data_3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(data_3));
        for (int i = 0; i < data_3.length; i++) {
            if (data_3[i] < 6) {
                int d = data_3[i] * 2;
                data_3[i] = d;
            }

        }
        System.out.println(Arrays.toString(data_3));

        //Task #4
        System.out.println("Task #4: ");

        int[][] deepData = new int[SIZE][SIZE];
        for (int i = 0; i < deepData.length; i++) {
            deepData[i][i] = deepData[i][(deepData.length - 1) - i] = 1;
        }
        for (int[] myArray : deepData) {
            for (int i : myArray) {
                System.out.printf("%3d", i);
            }
            System.out.println();
        }

        //Task #5
        System.out.println("Task #5: ");

        int[] array1 = IntStream.range(0, SIZE).map(i -> (int) (Math.random() * 100)).toArray();
        System.out.println(Arrays.toString(array1));
        int min = array1[0];
        int max = array1[0];
        for (int result : array1) {
            if (min > result) {
                min = result;
            } else if (max < result) {
                max = result;
            }
        }
        System.out.println("Наибольшее число в данном массиве = " + max);
        System.out.println("Наименьшее число в данном массиве = " + min);

        //Task #6
        System.out.println("Task #6: ");

        int[] balanceArr = IntStream.range(0, 8).map(i -> (int) (Math.random() * 2)).toArray();//генерируем для простоты массив со случайными 0 и 1
        System.out.println(Arrays.toString(balanceArr));//выводим полученный массив в консоль
        System.out.println("Результат = " + checkBalance(balanceArr));//ищем баланс

        //Task #7
        System.out.println("Task #7: ");

        int[] shiftArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(shiftArr));//исходный массив
        int n = -3;//отрицательное для смещения влево, положительное для смещения вправо

        shiftArrayRight(shiftArr, n);

    }

    private static void shiftArrayRight(int[] shiftArr, int n) {
        int l = shiftArr.length;
        if (n >= 0) {
            for (int i = 0; i < Math.abs(n); i++) {
                int lastIndex = shiftArr[l - 1];
                for (int j = l - 1; j > 0; j--) {
                    shiftArr[j] = shiftArr[j - 1];
                }
                shiftArr[0] = lastIndex;
            }
            System.out.println("Массив будет смещён на " + n + " элементов");
            System.out.println(Arrays.toString(shiftArr));
        } else {
        for (int i = 0; i < Math.abs(n); i++) {
            int startIndex = shiftArr[0];
            for (int j = 0; j < l - 1; j++) {
                shiftArr[j] = shiftArr[j + 1];
            }
            shiftArr[l - 1] = startIndex;
        }
        System.out.println("Массив будет смещён на " + n + " элементов");
        System.out.println(Arrays.toString(shiftArr));
    }

}


    public static boolean checkBalance(int[] balanceArr) {
        boolean isBalanced = false;
        int sumL = 0;
        int sumR = Arrays.stream(balanceArr).sum();
        for (int j : balanceArr) {
            sumL += j;
            sumR -= j;
            if (sumL == sumR) {
                isBalanced = true;
            } else if (sumL > sumR) {
                return isBalanced;
            }
        }
        return isBalanced;
    }
}

