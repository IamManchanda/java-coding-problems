import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>(); // or, new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
