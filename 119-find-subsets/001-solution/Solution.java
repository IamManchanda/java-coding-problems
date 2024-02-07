/**
 * Find Subsets
 * - Time complexity: O(2^n)
 * - Space complexity: O(n)
 */

public class Solution {
    public void findSubsets(String str) {
        findSubsets(str, "", 0);
    }

    private void findSubsets(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }

            return;
        }

        findSubsets(str, ans + str.charAt(i), i + 1);
        findSubsets(str, ans, i + 1);
    }
}

/*
 * Enter a string:
 * abc
 * 
 * Result:
 * abc
 * ab
 * ac
 * a
 * bc
 * b
 * c
 * null
 */
