import java.util.List;

/**
 * Validate Subsequence
 * https://www.algoexpert.io/questions/validate-subsequence
 * 
 * Approach: Enhanced For Loop Iterative
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

public class Solution {
    public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int seqIdx = 0;

        for (int value : array) {
            if (seqIdx == sequence.size()) {
                break;
            }

            if (sequence.get(seqIdx).equals(value)) {
                seqIdx++;
            }
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
