import java.util.*;

/**
 * Custom Queue using Stacks (ArrayDeque)
 */

public class CustomQueue {
    static ArrayDeque<Integer> mainStack = new ArrayDeque<>();
    static ArrayDeque<Integer> tempStack = new ArrayDeque<>();

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public void add(int item) { // Enqueue
        while (!mainStack.isEmpty()) {
            tempStack.push(mainStack.pop());
        }

        mainStack.push(item);

        while (!tempStack.isEmpty()) {
            mainStack.push(tempStack.pop());
        }
    }

    public int remove() { // Dequeue
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return mainStack.pop();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return mainStack.peek();
    }
}
