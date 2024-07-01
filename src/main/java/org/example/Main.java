package org.example;

import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


            int[] array = new int[20];

            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(15) + 1;
            }

            System.out.println("Содержимое массива:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

            System.out.println("Повторяющиеся значения:");
            HashSet<Integer> printedNumbers = new HashSet<Integer>();
            for (int i = 0; i < array.length; i++) {
                int count = 0;
                if (printedNumbers.contains(array[i])) {
                    continue;
                }
                for (int j = 0; j < array.length; j++) {
                    if (i != j && array[i] == array[j]) {
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println("Число '" + array[i] + "' встречается " + (count + 1) + " раза");
                    printedNumbers.add(array[i]);
                }

            }
    }
}