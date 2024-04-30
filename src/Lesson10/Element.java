package Lesson10;

import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = sc.nextInt();
        }


        int number = 0;
        int index = 0;
        for (int i = 0; i < arraySize; i++) {
            if (i != array[array.length - 1]) {
                if (number < array[i]) {
                    number = array[i];
                    index = i + 1;
                }
            }
        }
        System.out.println(number + " " + index);
    }
}
