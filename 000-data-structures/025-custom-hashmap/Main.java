import java.util.*;

public class Main {
    public static void main(String[] args) {
        CustomHashmap<String, Integer> hm = new CustomHashmap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Nepal", 5);

        Set<String> keys = hm.keySet();

        for (String key : keys) {
            Integer value = hm.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }

        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
