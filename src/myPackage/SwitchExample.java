package myPackage;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Şəhəri daxil et : ");
        String bolge = sc.nextLine();

        switch (bolge) {
            case "Baki":
                System.out.println("Bakı üçün pul 500Manat/Ay");
                break;
            case "Mingecevir":
                System.out.println("Mingecevir üçün pul 400Manat/Ay");
                break;
            case "Fuzuli":
                System.out.println("Fuzuli üçün pul 4500Manat/Ay");
                break;
            case "Seki":
                System.out.println("Seki üçün pul 440Manat/Ay");
                break;
            default:
                System.out.println("Düzgün şəhər daxil edin.");
        }
    }
}