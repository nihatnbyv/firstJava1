package lesson17;

import java.lang.reflect.Field;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        BiFunction<Integer, Integer, String> biFunction = new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer a, Integer b) {
                return String.valueOf(a+b);
            }
        };
        System.out.println(biFunction.apply(23, 7));

        BiFunction<Integer, Integer, String> biFunction1 = (a, b) -> String.valueOf(a+b);
        System.out.println(biFunction1.apply(8,18));

        Person person = new Person("Nihat", "Nebiyev", 25);
        Field age = person.getClass().getDeclaredField("age");
        age.setAccessible(true);
        age.set(person, 100);
        System.out.println(age.get(person));
    }
}