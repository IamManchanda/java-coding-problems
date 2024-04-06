import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        System.out.println(cities);

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
