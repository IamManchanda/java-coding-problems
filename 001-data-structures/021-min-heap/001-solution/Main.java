import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] values = { 3, 4, 1, 5 };
        MinHeap pq = new MinHeap(); // Priority Queue
        for (int value : values) {
            pq.add(value);
        }

        System.out.println("Input: ");
        System.out.println(Arrays.toString(values));

        ArrayList<Integer> result = new ArrayList<Integer>();
        while (!pq.isEmpty()) {
            result.add(pq.peek());
            pq.remove();
        }

        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);
    }
}
