package Lesson3;

import java.util.Scanner;

public class Bolunme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a%b!=0) {
            System.out.println(a/b + " " +a%b);
        }else {
            System.out.println("Divisible");
        }
    }
}