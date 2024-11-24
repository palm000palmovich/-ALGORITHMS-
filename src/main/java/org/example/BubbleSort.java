package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class BubbleSort {
    public static void main(String[] args){
        int[] arrs = new int[100000];
        for (int i = 0; i < arrs.length; i++) {
            arrs[i] = ThreadLocalRandom.current().nextInt(1000);
        }

        long start = System.currentTimeMillis();    //Проверка скорости
        bubbleSort(arrs);
        System.out.println(System.currentTimeMillis() - start);   //Проверка скорости

        for (int i = 0; i < arrs.length; i++) {
            System.out.println(arrs[i]);
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


}
