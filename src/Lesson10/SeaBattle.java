package Lesson10;


public class SeaBattle {
    public static void main(String[] args) {

        char[][] array = new char[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = '-';
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("|" + array[i][j] + " " );

            }
            System.out.println();
        }
    }
}