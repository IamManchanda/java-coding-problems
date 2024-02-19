import java.util.ArrayList;

/**
 * Valid IP Addresses
 * https://www.algoexpert.io/questions/valid-ip-addresses
 * 
 * Approach: Iterative
 * - Time complexity: O(1)
 * - Space complexity: O(1) auxiliary
 */

public class Solution {
    private static final int EIGHT_BIT_MAX_DECIMAL = 255;

    public ArrayList<String> validIPAddresses(String string) {
        ArrayList<String> validList = new ArrayList<String>();
        int n = string.length(), ni, nj, nk;

        ni = Math.min(n, 4);
        for (int i = 1; i <= ni - 1; i++) {
            String[] currentParts = new String[] { "", "", "", "" };

            currentParts[0] = string.substring(0, i);

            if (!isValidPart(currentParts[0])) {
                continue;
            }

            nj = Math.min(n - i, 4);
            for (int j = i + 1; j <= i + nj - 1; j++) {
                currentParts[1] = string.substring(i, j);

                if (!isValidPart(currentParts[1])) {
                    continue;
                }

                nk = Math.min(n - j, 4);
                for (int k = j + 1; k <= j + nk - 1; k++) {
                    currentParts[2] = string.substring(j, k);
                    currentParts[3] = string.substring(k);

                    if (!isValidPart(currentParts[2]) || !isValidPart(currentParts[3])) {
                        continue;
                    }

                    validList.add(join(currentParts));
                }
            }
        }

        return validList;
    }

    private boolean isValidPart(String string) {
        int stringAsInt = Integer.parseInt(string);

        if (stringAsInt > EIGHT_BIT_MAX_DECIMAL) {
            return false;
        }

        return string.length() == Integer.toString(stringAsInt).length();
    }

    private String join(String[] strings) {
        int n = strings.length;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= n - 1; i++) {
            sb.append(strings[i]);

            if (i < n - 1) {
                sb.append(".");
            }
        }

        return sb.toString();
    }
}

/*
 * Enter String `string`:
 * 1921680
 * 
 * Result:
 * [1.9.216.80, 1.92.16.80, 1.92.168.0, 19.2.16.80, 19.2.168.0, 19.21.6.80,
 * 19.21.68.0, 19.216.8.0, 192.1.6.80, 192.1.68.0, 192.16.8.0]
 */
