import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>(); // or, new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(0);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);

        System.out.println("first element: " + dq.getFirst());
        System.out.println("last element: " + dq.getLast());
    }
}
