import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] values = { 3, 4, 1, 5 };
        MaxHeap pqr = new MaxHeap(); // Priority Queue, reverse order
        for (int value : values) {
            pqr.add(value);
        }

        System.out.println("Input: ");
        System.out.println(Arrays.toString(values));

        ArrayList<Integer> result = new ArrayList<Integer>();
        while (!pqr.isEmpty()) {
            result.add(pqr.peek());
            pqr.remove();
        }

        System.out.println();
        System.out.println("Result: ");
        System.out.println(result);
    }
}
