package Questions.HashMapImpl;

import java.util.LinkedList;

public class HashMapMain {

    public static void main(String args[]) {
        MyHashMap<Integer, String> map = new MyHashMap<>(1);

        System.out.println(map.size());

        map.put(1, "Hi");
        map.put(2, "tititit");
        map.put(3, "Hello");
        map.put(4, "hiii");
        map.put(5, "Hello");
        map.put(6, "hiii");
        map.put(7, "Hello");

        System.out.println(map.size());
        System.out.println(map.getValue(1));
        System.out.println(map.remove(1));
        System.out.println(map.size());

        // custome implementation of entrySet Method
        for(MyHashMap.Entry entry : map.entrySet()) {
            System.out.println(entry.key + " -> " + entry.value);
        }
    }

}
