import java.util.*;

/**
 * Custom Stack using ArrayList
 */

public class CustomStack {
    private static ArrayList<Integer> list = new ArrayList<Integer>();

    public boolean isEmpty() {
        return list.size() == 0; // or, return list.isEmpty();
    }

    public void push(int value) {
        list.add(value);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int topIndex = list.size() - 1;
        int top = list.get(topIndex);
        list.remove(topIndex);

        return top;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return list.get(list.size() - 1);
    }
}
