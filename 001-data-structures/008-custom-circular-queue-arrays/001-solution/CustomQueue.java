/**
 * Custom Circular Queue using Arrays
 */

public class CustomQueue {
    static int size, rear, front;
    static int[] arr;

    CustomQueue(int n) {
        arr = new int[n];
        size = n;
        rear = front = -1;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void add(int item) { // Enqueue
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % size;
        arr[rear] = item;
    }

    public int remove() { // Dequeue
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int result = arr[front];

        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }

        return result;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }
}
