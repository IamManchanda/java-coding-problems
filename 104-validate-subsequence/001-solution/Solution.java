import java.util.List;

/**
 * Validate Subsequence
 * https://www.algoexpert.io/questions/validate-subsequence
 * 
 * Approach: Two pointers Iterative
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

public class Solution {
    public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrIdx = 0, seqIdx = 0;

        while (arrIdx < array.size() && seqIdx < sequence.size()) {
            if (array.get(arrIdx).equals(sequence.get(seqIdx))) {
                seqIdx++;
            }

            arrIdx++;
        }

        return seqIdx == sequence.size();
    }
}

/*
 * Entered `array`:
 * [5, 1, 22, 25, 6, -1, 8, 10]
 * 
 * Entered `sequence`:
 * [1, 6, -1, 10]
 * 
 * Result:
 * true
 */
