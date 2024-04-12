import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        Set<String> keys = hm.keySet();
        System.out.println(keys); // [India, China, US, Indonesia, Nepal]

        // Iterate over keys
        for (String key : keys) {
            Integer value = hm.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        System.out.println(entries); // [India=100, China=150, US=50, Indonesia=6, Nepal=5]

        // Iterate over entries
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
