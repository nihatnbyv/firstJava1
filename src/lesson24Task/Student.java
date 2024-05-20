package lesson24Task;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private Long id;
    private String name;
    private int age;

    public Student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{id=%d, name='%s', age=%d}".formatted(id, name, age);
    }

    @Override
    public int compareTo(Student that) {
        if (!this.id.equals(that.id)) {
            return Long.compare(that.id, this.id);
        } else {
            return this.id.compareTo(that.id);
        }

    }
}
