package myPackage;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IntAge {
    public static void main(String[] args) {
//        String[] students = new String[14];
//        String[] a = {"Emin", "Ilkin"};
//        students[0] = "Elgun";
//        students[1] = "Nihat";
//        students[2] = "Aqil";
//        students[3] = "Ilqar";
//        System.out.println(students[1]);
//
//        int[] age = {5, 45, 12, 23};
//        for (int i = 0; i < age.length; i++) {
//            System.out.println(age[i]);
//        }


        int[] numbers = {1, 5, 7, 9, 11, 17, 19};
        int[] nums = {15,2,79,64,4,78};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 64){
                System.out.println(i);
            }
        }
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        System.out.println(Arrays.binarySearch(nums, 64));
    }
}
