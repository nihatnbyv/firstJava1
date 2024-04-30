package Lesson6;

import java.util.Scanner;

public class CeminBolunmesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();


        long sum = 0;
        for (long i = 1; i <= k; i++) {
            sum += i;
            if (sum % k == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}