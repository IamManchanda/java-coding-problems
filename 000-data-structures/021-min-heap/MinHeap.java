import java.util.*;

/**
 * Min Heap (Priority Queue)
 */

public class MinHeap {
    private static ArrayList<Integer> arr = new ArrayList<Integer>();

    public void add(int data) {
        arr.add(data);

        int dataIdx = arr.size() - 1;
        int parentIdx = (dataIdx - 1) / 2;

        while (arr.get(dataIdx) < arr.get(parentIdx)) {
            int temp = arr.get(dataIdx);
            arr.set(dataIdx, arr.get(parentIdx));
            arr.set(parentIdx, temp);

            dataIdx = parentIdx;
            parentIdx = (dataIdx - 1) / 2;

            if (dataIdx == 0) {
                break;
            }
        }
    }

    public int peek() {
        return arr.get(0);
    }

    public int remove() {
        int data = arr.get(0);
        int dataIdx = arr.size() - 1;

        int temp = arr.get(0);
        arr.set(0, arr.get(dataIdx));
        arr.set(dataIdx, temp);

        arr.remove(dataIdx);
        heapify(0);

        return data;
    }

    private void heapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIdx = i;

        if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
            minIdx = left;
        }

        if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
            minIdx = right;
        }

        if (minIdx != i) {
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);

            heapify(minIdx);
        }
    }

    public boolean isEmpty() {
        return arr.size() == 0;
    }
}

/**
 * Input:
 * [3, 4, 1, 5]
 * 
 * Result:
 * [1, 3, 4, 5]
 */
