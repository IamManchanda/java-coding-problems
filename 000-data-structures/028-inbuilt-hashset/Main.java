import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(4);
        hs.add(2);
        hs.add(1);

        System.out.println(hs); // [1, 2, 4]
        System.out.println("Size: " + hs.size()); // Size: 3
        System.out.println(hs.isEmpty()); // false
        checkKeyPresent(hs, 2); // 2 is present
        checkKeyPresent(hs, 3); // 2 is present

        hs.remove(2);

        System.out.println(hs); // [1, 4]
        System.out.println("Size: " + hs.size()); // Size: 2
        System.out.println(hs.isEmpty()); // false
        checkKeyPresent(hs, 2); // 2 is not present

        hs.clear();

        System.out.println(hs); // []
        System.out.println("Size: " + hs.size()); // Size: 0
        System.out.println(hs.isEmpty()); // true
    }

    private static void checkKeyPresent(Set<Integer> hs, Integer key) {
        if (hs.contains(key)) {
            System.out.println(key + " is present");
        } else {
            System.out.println(key + " is not present");
        }
    }
}
