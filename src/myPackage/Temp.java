package myPackage;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp > 0) {
            System.out.println("Water");
        } else {
            System.out.println("Ice");
        }

    }
}
