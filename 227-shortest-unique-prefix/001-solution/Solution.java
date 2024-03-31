import java.util.ArrayList;

/**
 * Shortest Unique prefix
 */

public class Solution {
    private static final int ALPHABET_SIZE = 26;
    private static Node root = new Node();

    public String[] findPrefixes(String[] arr, int N) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            insert(arr[i]);
        }

        root.freq = -1;
        findPrefix(root, "", result);

        return result.toArray(new String[result.size()]);
    }

    private static void findPrefix(Node root, String ans, ArrayList<String> result) {
        if (root == null) {
            return;
        }

        if (root.freq == 1) {
            result.add(ans);
            return;
        }

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            if (root.children[i] != null) {
                String newAns = ans + (char) (i + 'a');
                findPrefix(root.children[i], newAns, result);
            }
        }
    }

    private static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    static class Node {
        Node children[] = new Node[ALPHABET_SIZE];
        boolean eow = false;
        int freq;

        Node() {
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                children[i] = null;
            }

            freq = 1;
        }
    }
}

/*
 * Entered `arr[]`:
 * [zebra, dog, duck, dove]
 * 
 * Result:
 * [dog, dov, du, z]
 */
