package Lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayOfTheWeek = sc.nextInt();
//        int taskOfTheDay = sc.nextInt();
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Monday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Thursday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Wednesday";
        schedule[2][1] = "play football";
        schedule[3][0] = "Thursday";
        schedule[3][1] = "do exercise";
        schedule[4][0] = "Friday";
        schedule[4][1] = "sleep";
        schedule[5][0] = "Saturday";
        schedule[5][1] = "go to school";
        schedule[6][0] = "Sunday";
        schedule[6][1] = "play with phone";
//        switch (dayOfTheWeek) {
//            case (0) :
//                System.out.println(schedule[0][0]);
//                break;

//            case (1) :
//                System.out.println(schedule[1][0]);
//                break;
//
//            case (2) :
//                System.out.println(schedule[2][0]);
//                break;
//
//            case (3) :
//                System.out.println(schedule[3][0]);
//                break;
//
//            case (4) :
//                System.out.println(schedule[4][0]);
//                break;
//
//            case (5) :
//                System.out.println(schedule[5][0]);
//                break;
//
//            case (6) :
//                System.out.println(schedule[6][0]);
//                break;
//        }

//        switch (taskOfTheDay) {
//            case (0) :
//                System.out.println(schedule[0][1]);
//                break;
//
//            case (1) :
//                System.out.println(schedule[1][1]);
//                break;
//
//            case (2) :
//                System.out.println(schedule[2][1]);
//                break;
//
//            case (3) :
//                System.out.println(schedule[3][1]);
//                break;
//
//            case (4) :
//                System.out.println(schedule[4][1]);
//                break;
//
//            case (5) :
//                System.out.println(schedule[5][1]);
//                break;
//
//            case (6) :
//                System.out.println(schedule[6][1]);
//                break;
//        }
        if (dayOfTheWeek == 0) {
            System.out.println(schedule[0][1]);
        } else if (dayOfTheWeek == 1) {
            System.out.println(schedule[1][1]);
        }else if (dayOfTheWeek == 2) {
            System.out.println(schedule[2][1]);
        }else if (dayOfTheWeek ==3) {
            System.out.println(schedule[3][1]);
        }else if (dayOfTheWeek == 4) {
            System.out.println(schedule[4][1]);
        }else if (dayOfTheWeek == 5) {
            System.out.println(schedule[5][1]);
        }else if (dayOfTheWeek == 6) {
            System.out.println(schedule[6][1]);
        }
    }
}
