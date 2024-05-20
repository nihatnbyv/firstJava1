package lesson22;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HasMapApp {
    public static void main(String[] args) {
        HashMap<Long, String> hashMap = new HashMap<>();
        hashMap.put(1L, "Nihat");
        hashMap.put(3L, "Nihat");
        hashMap.put(2L, "Nihat");
        hashMap.put(14L, "Nihat");
        hashMap.put(237L, "Nihat");
        hashMap.put(295L, "Nihat");
        hashMap.put(22L, "Nihat");
        hashMap.put(89L, "Nihat");
        hashMap.put(1849L, "Nihat");
        hashMap.put(298L, "Nihat");

        System.out.println(hashMap);

        Hashtable<Long, String> hashtable = new Hashtable<>();
        hashtable.put(1L, "Nihat");
        hashtable.put(3L, "Nihat");
        hashtable.put(2215L, "Nihat");
        hashtable.put(298L, "Nihat");
        hashtable.put(274L, "Nihat");
        hashtable.put(214L, "Nihat");
        hashtable.put(20L, "Nihat");
        hashtable.put(8L, "Nihat");

        System.out.println(hashtable);


        TreeMap<Long, String> treeMap = new TreeMap<>();
        treeMap.put(295L, "Nihat");
        treeMap.put(22L, "Nihat");
        treeMap.put(89L, "Nihat");
        treeMap.put(189L, "Nihat");
        treeMap.put(298L, "Nihat");
        System.out.println(treeMap);
    }
}
