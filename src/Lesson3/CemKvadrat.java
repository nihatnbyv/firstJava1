package Lesson3;

import java.util.Scanner;

public class CemKvadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num / 10;
        int b = num % 10;
        int cem = (a+b);
        int kv = cem * cem;
        System.out.println(kv);
    }
}
