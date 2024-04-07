import java.util.*;

/**
 * First non-repeating character in a stream
 * https://www.geeksforgeeks.org/problems/first-non-repeating-character-in-a-stream1216/1
 * 
 * Approach: Table (int[]) and Queue (LinkedList)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 */

public class Solution {
    public String FirstNonRepeating(String A) {
        StringBuilder result = new StringBuilder("");
        int[] freq = new int[26]; // a-z
        Queue<Character> q = new LinkedList<>();

        for (char ch : A.toCharArray()) {
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                result.append("#");
            } else {
                result.append(q.peek());
            }
        }

        return result.toString();
    }
}

/*
 * Enter String `s`:
 * aabc
 * 
 * Result:
 * a#bb
 */

/*
 * Enter String `s`:
 * zz
 * 
 * Result:
 * z#
 */

/*
 * Enter String `s`:
 * aabccxb
 * 
 * Result:
 * a#bbbbx
 */
