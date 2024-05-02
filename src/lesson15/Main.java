package lesson15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
//        int num = Integer.parseInt(word);
        try {
            int num = Integer.parseInt(word);
        }catch (NumberFormatException e) {
            System.out.println("55");
        }
//        System.out.println(num);
    }
}
