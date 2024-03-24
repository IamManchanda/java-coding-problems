import java.util.*;

/**
 * Custom HashMap implementation.
 */

public class CustomHashMap<K, V> {
    private class Node {
        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private static final double THRESHOLD_VALUE = 2.0;

    private int n;
    private int N;
    private LinkedList<Node>[] buckets;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        this.n = 4;
        this.N = 4;
        this.buckets = new LinkedList[4];

        for (int i = 0; i < 4; i++) {
            this.buckets[i] = new LinkedList<>();
        }
    }

    private int hashFun(K key) {
        int hc = key.hashCode();
        return Math.abs(hc) % this.N;
    }

    private int searchInBucket(K key, int bi) {
        LinkedList<Node> bucket = this.buckets[bi];
        int di = 0;

        for (Node node : bucket) {
            if (node.key.equals(key)) {
                return di;
            }

            di++;
        }

        return -1;
    }

    @SuppressWarnings("unchecked")
    private void rehash() {
        LinkedList<Node>[] oldBuckets = this.buckets;
        this.N = 2 * this.N;
        this.buckets = new LinkedList[this.N];

        for (int i = 0; i < this.N; i++) {
            this.buckets[i] = new LinkedList<>();
        }

        for (int i = 0; i < oldBuckets.length; i++) {
            LinkedList<Node> bucket = oldBuckets[i];

            for (Node node : bucket) {
                put(node.key, node.value);
            }
        }
    }

    public void put(K key, V value) {
        int bi = hashFun(key);
        int di = searchInBucket(key, bi);

        if (di != -1) {
            Node currNode = this.buckets[bi].get(di);
            currNode.value = value;
        } else {
            Node newNode = new Node(key, value);
            this.buckets[bi].add(newNode);
            this.n++;
        }

        double lambda = (double) this.n / this.N;

        if (lambda > THRESHOLD_VALUE) {
            rehash();
        }
    }

    public boolean containsKey(K key) {
        int bi = hashFun(key);
        int di = searchInBucket(key, bi);

        return di != -1;
    }

    public V remove(K key) {
        int bi = hashFun(key);
        int di = searchInBucket(key, bi);

        if (di != -1) {
            Node currNode = this.buckets[bi].remove(di);
            this.n--;
            return currNode.value;
        }

        return null;
    }

    public V get(K key) {
        int bi = hashFun(key);
        int di = searchInBucket(key, bi);

        if (di != -1) {
            Node currNode = this.buckets[bi].get(di);
            return currNode.value;
        }

        return null;
    }

    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();

        for (int i = 0; i < this.N; i++) {
            LinkedList<Node> bucket = this.buckets[i];

            for (Node node : bucket) {
                keys.add(node.key);
            }
        }

        return keys;
    }

    public boolean isEmpty() {
        return this.n == 0;
    }
}
