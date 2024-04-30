package myPackage;

import java.util.Scanner;

public class TekCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num % 2 == 1) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }
    }
}