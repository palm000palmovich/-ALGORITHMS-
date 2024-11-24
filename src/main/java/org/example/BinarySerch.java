package org.example;

public class BinarySerch {
    public static void main(String[] args){

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }

        System.out.println(contains(array, 4));
    }


     //Метод бинарного поиска
    public static boolean contains(int[] arr, int element) {
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;

            if (element == arr[mid]) {
                return true;
            }

            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }

}
