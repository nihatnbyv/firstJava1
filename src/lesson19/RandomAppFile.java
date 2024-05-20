package lesson19;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RandomAppFile {

    public static final String RESOURCE = "src/lesson19/resource/";

    public static void main(String[] args) {

        Random rn = new Random();
        byte[] ra = new byte[20];
        for (int i = 0; i < ra.length; i++) {
            ra[i] = (byte) rn.nextInt(100);
        }


        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE + "random.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(ra);
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.getMessage();
        }

        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "random.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes1 = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes1));
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
