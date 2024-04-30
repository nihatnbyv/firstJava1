package Lesson3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 1) {
            System.out.println("ODD");
        } else if (num % 2 == 0) {
            System.out.println("EVEN");
        }
    }
}