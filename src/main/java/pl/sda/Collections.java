package pl.sda;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random generator = new Random();

        for(int i = 0; i<100; i++){

            list.add(generator.nextInt(20));
        }
        System.out.println(list);

        Set<Integer> hashSet = new HashSet<>(list);
        System.out.println(hashSet);

        Set<Integer> treeSet = new TreeSet<>(list);
        System.out.println(treeSet);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 100; i++){
            Integer key = list.get(i);
            if (!map.containsKey(key)){
                map.put(key,1);
            }else {
                map.put(key,map.get(key) + 1);
            }

        }
        System.out.println(map);

    }
}