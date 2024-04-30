package Lesson11;

import java.util.ArrayList;
import java.util.List;

public class OddNumber {

    public static void main(String[] args) {
        System.out.println(generateNumber((int) (Math.random() * 100), (int) (Math.random() * 100)));
    }

    private static List<Integer> generateNumber (int num1, int num2){

        List<Integer> integers = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            if (i%2==1) {
                integers.add(i);
            }
        }
        return integers;
    }
}
