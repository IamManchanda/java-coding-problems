/**
 * Longest Word with All Prefixes
 */

public class Solution {
    private static final int ALPHABET_SIZE = 26;
    private static Node root = new Node();
    private static String result = "";

    public String longestWordWithAllPrefix(String[] words) {
        for (String word : words) {
            insert(word);
        }

        StringBuilder temp = new StringBuilder("");
        longestWord(root, temp);

        return result;
    }

    private static void longestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < ALPHABET_SIZE; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                char ch = (char) (i + 'a');
                temp.append(ch);

                if (temp.length() > result.length()) {
                    result = temp.toString();
                }

                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1); // Backtrack
            }
        }
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

/**
 * Entered `words[]`:
 * [a, banana, app, apply, ap, appl, apple]
 * 
 * Result:
 * apple
 */