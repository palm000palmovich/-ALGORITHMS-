package org.example;

import java.util.concurrent.ThreadLocalRandom;

public class FastSort {
    public static void main(String[] args){
        int[] array = new int[100000];

        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10000);
        }

        long start = System.currentTimeMillis();    //Проверка скорости
        quickSort(array, 0, 99999);
        System.out.println(System.currentTimeMillis() - start);   //Проверка скорости

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void quickSort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                swapElements(arr, i, j);
            }
        }

        swapElements(arr, i + 1, end);
        return i + 1;
    }

    private static void swapElements(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}