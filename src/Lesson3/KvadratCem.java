package Lesson3;

import java.util.Scanner;

public class KvadratCem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long cem = 0;
        for (long i = 1; i <= n; i++) {
            long kv = i * i;
            cem = cem + kv;
        }
        System.out.println(cem);
    }
}