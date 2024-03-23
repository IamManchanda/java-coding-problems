import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm); // {India=100, China=150, US=50}
        System.out.println(hm.size()); // 3

        int population = hm.get("India");
        System.out.println("Population of India: " + population); // 100

        System.out.println(hm.get("Indonesia")); // null

        checkKeyPresent(hm, "India"); // India is present in the map
        checkKeyPresent(hm, "Indonesia"); // Indonesia is not present in the map

        System.out.println(hm.remove("China")); // 150
        System.out.println(hm); // {India=100, US=50}
        System.out.println(hm.size()); // 2

        System.out.println(hm.isEmpty()); // false

        hm.clear();
        System.out.println(hm); // {}
        System.out.println(hm.size()); // 0
        System.out.println(hm.isEmpty()); // true
    }

    private static void checkKeyPresent(Map<String, Integer> hm, String key) {
        if (hm.containsKey(key)) {
            System.out.println(key + " is present in the map");
        } else {
            System.out.println(key + " is not present in the map");
        }
    }
}
