/**
 * Find Permutations
 */

public class Solution {
    public void findPermutations(String str) {
        findPermutations(str, "");
    }

    private void findPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        String newStr;

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + curr);
        }
    }
}

/*
 * Enter a string:
 * abc
 * 
 * Result:
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 */
