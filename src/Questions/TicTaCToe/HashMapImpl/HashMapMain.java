package Questions.TicTaCToe.HashMapImpl;

public class HashMapMain {

    public static void main(String args[]) {
        MyHashMap<Integer, String> map = new MyHashMap<>();

        System.out.println(map.size());

        map.put(1, "Hi");
        map.put(1, "tititit");
        map.put(2, "Hello");
        map.put(5, "hiii");
        map.put(3, "Hello");

        System.out.println(map.size());
        System.out.println(map.getValue(1));
        System.out.println(map.remove(1));
        System.out.println(map.size());

    }

}
