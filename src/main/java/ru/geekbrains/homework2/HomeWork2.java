package ru.geekbrains.homework2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {

        //Task #1
        System.out.println("Task #1: ");
        final int SIZE = 9;
        int[] data = new int[SIZE];
        for (int i = 0 ; i < data.length; i++) {
            data[i] = (int)(Math.random() * 2);
        }
        System.out.println(Arrays.toString(data));
        for(int i = 0 ; i < data.length; i++) {
            if (data[i] == 0) {
                data [i] = 1;
            } else {
                data [i] = 0;
            }
        }
        System.out.println(Arrays.toString(data));

        //Task #2
        System.out.println("Task #2: ");
        final int SIZE_2 = 8;
        int[] data_2 = new int[SIZE_2];
        int a = 0;
        for (int i = 0 ; i < data_2.length; i++) {
            data_2[i] = a;
            a+=3;
            System.out.printf("%3d ", data_2[i]);
        }
        System.out.println();

       /* Вариант Макса (для понимания процесса!)

        final int SIZE_2 = 8;
        int[] data_2 = new int[SIZE_2];
        for (int i = 0 ; i < data_2.length; i++) {
            data_2[i] = i * 3;
            System.out.printf("%3d ", data_2[i]);
        }
        System.out.println();*/

        //Task #3
        System.out.println("Task #3: ");
        int[] data_3 = {1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println(Arrays.toString(data_3));
        for (int i = 0; i < data_3.length; i++) {
            if (data_3[i] < 6) {
               int d = data_3[i] * 2;
                data_3 [i] = d;
            }

        }
        System.out.println(Arrays.toString(data_3));

        //Task #4
        System.out.println("Task #4: ");
        final int SIZE_3 = 3;
        int[][] deepData = new int[SIZE_3][SIZE_3];
        int n = 0;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = ++n;
            }
        }
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                System.out.printf("%3d", deepData[i][j]);


            }
            System.out.println();
        }

        /*for(int i = 0; i <22; i+=3) {
            data2[i] = i;
        }
        System.out.printf("%3d", data2);*/

        /*for (int i = 20; i > 0; i--){


            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }*/
            /*int i = 1;
            while (i < 20) {
                i++;
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);
            }*/
       /* for(int j = 1; j < 21; j++){

                System.out.println("Cлучайное число № " + j + " = " + (int)(Math.random() * 1000));
            }

            int i = 0;
            while (i < 20) {
                i++;
                System.out.println("Cлучайное число № " + i + " = " + (int)(Math.random() * 1000));
            }*/

      //  final int SIZE = 7;
       /* int[] data = new int[SIZE];

        data[0] = 3;
        data[1] = 7;
        data[2] = 2;
        data[3] = 6;
        data[4] = 8;*/

/*//        System.out.println(data[1]);

        for (int i = 0 ; i < data.length; i++) {
            System.out.println(data[i]);
        }*/
       /* Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5,6,7}));
        for(int a = 0; a <22; a+=3){
            System.out.println(a);
        }*/
       /* int[][] deepData = new int[SIZE][SIZE];
        int n = 0;
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                deepData[i][j] = ++n;
            }
        }
        for (int i = 0; i < deepData.length; i++) {
            for (int j = 0; j < deepData[i].length; j++) {
                System.out.printf("%3d", deepData[i][j]);


            }
            System.out.println();
        }*/
    }
}