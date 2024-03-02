import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        // or, Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
