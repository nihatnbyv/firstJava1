package Lesson3;

import java.util.Scanner;

public class EynIsareliEdedler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a >= 0 && b >= 0) {
            System.out.println("1");
        } else if (a<0 && b<0) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}