package lesson20;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileApp01 {

    public static final String RESOUCE = "src/lesson20/resource/";

    public static void main(String[] args) {


        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Ali", "Huseynov", 9));
        people.add(new Person("Aqil", "Mansurov", 34 ));
        people.add(new Person("Ilkin", "Aliyev", 50));

        try (FileOutputStream fos = new FileOutputStream(RESOUCE + "person.ser");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(people);
        } catch (IOException e) {
            e.getMessage();
        }

        try (FileInputStream fis = new FileInputStream(RESOUCE + "person.ser");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis)) {
            Object object = ois.readObject();
            if (object instanceof List<?>) {
                System.out.println(object);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.getMessage();
        }
    }
}
