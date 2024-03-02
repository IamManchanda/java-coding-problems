/**
 * Custom Queue using Arrays
 */

public class CustomQueue {
    static int size, rear;
    static int[] arr;

    CustomQueue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void add(int item) { // Enqueue
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        arr[++rear] = item;
    }

    public int remove() { // Dequeue
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int front = arr[0];

        for (int i = 0; i <= rear - 1; i++) {
            arr[i] = arr[i + 1];
        }

        rear--;

        return front;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[0];
    }
}
