package Lesson3;

import java.util.Scanner;

public class AylarRubler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ay = sc.nextInt();
        if (ay >= 1 && ay <= 3) {
            System.out.println("First");
        }else if (ay >= 4 && ay <= 6) {
            System.out.println("Second");
        }else if (ay >= 7 && ay <= 9) {
            System.out.println("Third");
        }else if (ay >= 10 && ay <= 12) {
            System.out.println("Fourth");
        }
    }
}
