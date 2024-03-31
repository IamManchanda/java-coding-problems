/**
 * startsWith Problem
 * 
 * Approach: Trie
 */

public class Solution {
    private static final int ALPHABET_SIZE = 26;
    private static Node root = new Node();

    public boolean startsWith(String[] words, String prefix) {
        for (String word : words) {
            insert(word);
        }

        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
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
 * Entered `words[]`:
 * [apple, app, mango, man, woman]
 * 
 * Enter `prefix`:
 * app
 * 
 * Result:
 * true
 */

/*
 * Entered `words[]`:
 * [apple, app, mango, man, woman]
 * 
 * Enter `prefix`:
 * moon
 * 
 * Result:
 * false
 */
