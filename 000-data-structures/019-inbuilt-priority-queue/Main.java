import java.util.*;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        System.out.println("PriorityQueue: ");
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.poll();
        }

        PriorityQueue<Integer> pqr = new PriorityQueue<>(Collections.reverseOrder());

        pqr.add(3);
        pqr.add(4);
        pqr.add(1);
        pqr.add(7);

        System.out.println();
        System.out.println("PriorityQueue with reverse order: ");
        while (!pqr.isEmpty()) {
            System.out.println(pqr.peek());
            pqr.poll();
        }
    }
}
