import java.util.*;
import java.util.stream.Collectors;

public class Helper {
    public static String transform(List<Integer[]> result) {
        return result.stream()
                .map(Arrays::toString)
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
