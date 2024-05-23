package lesson24Task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {new Student(784321814, "Nihat", 26),
                new Student(818612434, "Hesen", 28),
                new Student(984318493, "Aqil", 27)};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("-------------------");

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().compareTo(s1.getName());
            }
        });
        System.out.println(Arrays.toString(students));

        System.out.println("-------------------");

        Arrays.sort(students, (s1, s2) -> Long.compare(s1.getAge(), s2.getAge()));
        System.out.println(Arrays.toString(students));

    }
}
