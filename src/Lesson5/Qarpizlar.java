package Lesson5;

import java.util.Scanner;

public class Qarpizlar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int max = 0;
        int min = 30000;

        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();

            if (n > max)
                max = n;

            if (n < min)
                min = n;
        }

        if (num < 2) {
            System.out.println("Ooops!");
        } else {
            System.out.print(min + " " + max);
        }
    }
}