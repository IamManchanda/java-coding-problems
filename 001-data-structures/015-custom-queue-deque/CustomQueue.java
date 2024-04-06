import java.util.*;

/**
 * Custom Queue using Deque (LinkedList)
 */

public class CustomQueue {
    Deque<Integer> dq = new LinkedList<>();

    public boolean isEmpty() {
        return dq.isEmpty();
    }

    public void add(int item) { // Enqueue
        dq.addLast(item);
    }

    public int remove() { // Dequeue
        return dq.removeFirst();
    }

    public int peek() {
        return dq.getFirst();
    }
}
