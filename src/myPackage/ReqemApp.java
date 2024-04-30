package myPackage;

import java.util.Scanner;

public class ReqemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 0;
        do {
            num /= 10;
            counter++;
        } while (num > 0);
        System.out.println(counter);
    }
}