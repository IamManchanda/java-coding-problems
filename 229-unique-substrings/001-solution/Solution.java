/**
 * Unique Substrings
 * 
 * Approach: Trie
 */

public class Solution {
    private static final int ALPHABET_SIZE = 26;
    private static Node root = new Node();

    public int uniqueSubstrings(String s) {
        for (int i = 0; i < s.length(); i++) {
            String suffix = s.substring(i);
            insert(suffix);
        }

        return countNodes(root);
    }

    private static int countNodes(Node node) {
        if (node == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < ALPHABET_SIZE; i++) {
            if (node.children[i] != null) {
                count += countNodes(node.children[i]);
            }
        }

        return count + 1;
    }

    private static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    static class Node {
        Node children[] = new Node[ALPHABET_SIZE];
        boolean eow = false;

        Node() {
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                children[i] = null;
            }
        }
    }
}

/*
 * Enter String `s`:
 * ababa
 * 
 * Result:
 * 10
 */