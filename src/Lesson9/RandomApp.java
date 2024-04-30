package Lesson9;

import java.util.Scanner;

public class RandomApp {
    public static void main(String[] args) {

        int randomNum = (int) (Math.random() * 100);
        int a = 0;
        while (a < 100) {
//            Burda while içərisində true yazaraq və aşağıdakı a++ silərək də işlədə bilərdik.
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if (num == randomNum) {
                System.out.println("Congratulations !");
                break;
            } else if (num > randomNum) {
                System.out.println("Ədədiniz böyükdür.");
            } else {
                System.out.println("Rəqəminiz kiçikdir.");
            }
            a++;
        }
    }
}
