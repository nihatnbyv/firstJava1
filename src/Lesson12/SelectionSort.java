package Lesson12;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] nums = new int[]{5, 3, 4, 23, 1, 2, 7, 20, 75, 45};


        for (int i = 0; i < nums.length; i++) {
            int min = nums[0];
            int minIndex = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }

            nums [minIndex] = nums[i];
            nums[i] = min;
        }

        System.out.println(Arrays.toString(nums));
    }
}