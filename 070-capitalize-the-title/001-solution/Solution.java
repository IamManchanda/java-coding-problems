/**
 * Capitalize the Title
 * https://leetcode.com/problems/capitalize-the-title/description/
 */

public class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 2) {
                sb.append(word.toLowerCase());
            } else {
                sb.append(Character.toUpperCase(word.charAt(0)));
                sb.append(word.substring(1).toLowerCase());
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}

/*
 * Enter the String:
 * capiTalIze tHe titLe
 * 
 * Result:
 * Capitalize The Title
 */

/*
 * Enter the String:
 * First leTTeR of EACH Word
 * 
 * Result:
 * First Letter of Each Word
 */

/*
 * Enter the String:
 * i lOve leetcode
 * 
 * Result:
 * i Love Leetcode
 */
