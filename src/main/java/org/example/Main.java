package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < 100000; i++){
            nums.add(ThreadLocalRandom.current().nextInt(1000));
        }

        long start = System.currentTimeMillis();    //Проверка скорости
        selectionSort(nums);
        System.out.println(System.currentTimeMillis() - start);   //Проверка скорости

        System.out.println(nums);
    }

    public static void selectionSort(List<Integer> numbers){
        for (int idxCurr = numbers.size() - 1; idxCurr >= 0; idxCurr--) {

            int max = numbers.get(0), idMax = 0;

            for (int j = 0; j <= idxCurr; j++) {
                if (max < numbers.get(j)) {
                    max = numbers.get(j);
                    idMax = j;
                }
            }
            int tmp = numbers.get(idxCurr);
            numbers.set(idxCurr, max);
            numbers.set(idMax, tmp);
        }

    }
}