package dsa.hashmap;

public class Main {

    public static void main(String[] args) {

        HashMap map = new HashMap();

        map.put("apple", 5);
        map.put("banana", 3);
        map.put("orange", 7);

        System.out.println("apple: " + map.get("apple"));
        System.out.println("banana: " + map.get("banana"));
        System.out.println("orange: " + map.get("orange"));

        map.put("banana", 10);

        System.out.println("banana updated: " + map.get("banana"));

        map.remove("apple");

        System.out.println("apple removed: " + map.get("apple"));
    }
}