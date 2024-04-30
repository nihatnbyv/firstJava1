package myPackage;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
//        int[] nums = {24, 41, 5, 98, 23};

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int max = nums[0];
        int min = nums[0];
        int sum = nums[0];
        int pro = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }

            if (min > nums[i]) {
                min = nums[i];
            }

            sum= sum + nums[i];
            pro= pro * nums[i];
        }
        System.out.println(sum);
        System.out.println(pro);
//        System.out.println(max);
//        System.out.println(min);
    }
}