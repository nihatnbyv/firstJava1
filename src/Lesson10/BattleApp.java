package Lesson10;

public class BattleApp {
    public static void main(String[] args) {
        char[][] array = new char[6][6];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '-';
            }
        }

        for (int j = 0; j < array[0].length; j++) {
            array[0][j] = (char) ('0' + j);
        }


        for (int i = 0; i < array.length; i++) {
            array[i][0] = (char) ('0' + i);
        }


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j] + " | " );
            }
            System.out.println();
        }
    }
}
