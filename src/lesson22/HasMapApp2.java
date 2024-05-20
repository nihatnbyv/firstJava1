package lesson22;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class HasMapApp2 {
    public static void main(String[] args) {
        final String word = "MANCHESTER";
        char [] charArray = word.toCharArray();
        
        Map<Character, Integer> hashMap = new HashMap<>();

        for (char c : charArray) {

//            if (hashMap.containsKey(c)){
//                Integer count = hashMap.get(c);
//                hashMap.put(c, count +1);
//            } else {
//                hashMap.put(c, 1);
//            }

            Integer merge = hashMap.merge(c, 1, new BiFunction<Integer, Integer, Integer>() {
                @Override
                public Integer apply(Integer integer, Integer integer2) {
                    return integer + integer2;
                }
            });
        }
        System.out.println(hashMap);
    }
}
