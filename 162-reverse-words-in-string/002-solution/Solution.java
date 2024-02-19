/**
 * Reverse Words In String
 * https://www.algoexpert.io/questions/reverse-words-in-string
 * 
 * Approach: Iterative (Two Pointers)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 * where, n is the length of the input string
 */

public class Solution {
    public String reverseWordsInString(String string) {
        char[] characters = string.toCharArray();
        int s = 0, e, n = characters.length;

        reverseList(characters, s, n - 1);

        for (int i = 0; i <= n - 1; i++) {
            e = s;

            while (e <= n - 1 && characters[e] != ' ') {
                e++;
            }

            reverseList(characters, s, e - 1);
            s = e + 1;

            if (s >= n) {
                break;
            }
        }

        return new String(characters);
    }

    private char[] reverseList(char[] list, int start, int end) {
        while (start < end) {
            swap(list, start, end);
            start++;
            end--;
        }

        return list;
    }

    private void swap(char[] list, int i, int j) {
        char temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}

/*
 * Enter String `string`:
 * AlgoExpert is the best!
 * 
 * Result:
 * best! the is AlgoExpert
 */
