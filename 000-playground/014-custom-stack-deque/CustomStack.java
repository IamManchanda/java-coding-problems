import java.util.*;

/**
 * Custom Stack using Deque (LinkedList)
 */

public class CustomStack {
    Deque<Integer> dq = new LinkedList<>();

    public boolean isEmpty() {
        return dq.isEmpty();
    }

    public void push(int data) {
        dq.addLast(data);
    }

    public int pop() {
        return dq.removeLast();
    }

    public int peek() {
        return dq.getLast();
    }
}
