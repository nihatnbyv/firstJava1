package lesson18;

import java.io.*;

public class FileApp {

    public static final String RESOURCE = "src/lesson18/resource/";

    public static void main(String[] args) {
        File file = new File(RESOURCE + "hello.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello World !");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            System.out.println(s);
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}