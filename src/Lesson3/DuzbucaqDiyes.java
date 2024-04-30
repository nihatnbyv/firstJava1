package Lesson3;

import java.util.Scanner;

public class DuzbucaqDiyes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int en = sc.nextInt();
        int uzunluq = sc.nextInt();

        for (int i = 0; i < en; i++) {
            for (int j = 0; j < uzunluq; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
