package Lesson4;

public class ArrayAppp {
    public static void main(String[] args) {
        int[][] nums = new int[5][8];


        int counter = 0;
        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums[row].length; column++) {
                nums[row][column]=counter++;
            }
        }
        for (int row = 0; row < nums.length; row++) {
            for (int column = 0; column < nums[row].length; column++) {
                System.out.print(nums[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
