package Lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class NewApp {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        checkArray(list, 5);
        checkArray(set, 5);
    }

    public static void checkArray (Collection collection, int a) {
        if (collection.contains(a)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}