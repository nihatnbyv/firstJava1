package Lesson10;

import java.util.Scanner;

public class Qonsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        int counter = 0;

        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < arraySize; i++) {
            if (i != 0 && i != array.length - 1) {
                int element = array[i];
                int prevElement = array[i - 1];
                int nextElement = array[i + 1];
                if (element > prevElement && element > nextElement) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}