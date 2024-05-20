package lesson19;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileApp {

    public static final String RESOURCE = "src/lesson19/resource/";

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream(RESOURCE+ "a.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Nihat".getBytes(StandardCharsets.UTF_8));
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.getMessage();
        }

        try {
            FileInputStream fis = new FileInputStream(RESOURCE + "a.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
        } catch (IOException e) {
            e.getMessage();
        }

    }
}