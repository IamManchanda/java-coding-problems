import java.util.*;

/**
 * Underscorify Substring
 * https://www.algoexpert.io/questions/underscorify-substring
 * 
 * Approach: Collapse Overlapping Locations
 * - Time complexity: O(n + m) average, O(n * m) worst
 * - Space complexity: O(n)
 * where, n is the length of the string `str`
 * and, m is the length of the string `substring`
 */

public class Solution {
    public String underscorifySubstring(String str, String substring) {
        List<Integer[]> locations = collapse(getLocations(str, substring));
        return underscorify(str, locations);
    }

    private List<Integer[]> getLocations(String str, String substring) {
        List<Integer[]> locations = new ArrayList<>();
        int start = 0;

        while (start < str.length()) {
            int next = str.indexOf(substring, start);

            if (next != -1) {
                Integer[] currentLocation = new Integer[] { next, next + substring.length() };

                locations.add(currentLocation);
                start = next + 1;
            } else {
                break;
            }
        }

        return locations;
    }

    private List<Integer[]> collapse(List<Integer[]> locations) {
        if (locations.size() == 0) {
            return locations;
        }

        List<Integer[]> newLocations = new ArrayList<>();
        Integer[] previous = locations.get(0);
        newLocations.add(previous);

        for (int i = 1; i <= locations.size() - 1; i++) {
            Integer[] current = locations.get(i);

            if (current[0] <= previous[1]) {
                previous[1] = Math.max(previous[1], current[1]);
            } else {
                newLocations.add(current);
                previous = current;
            }
        }

        return newLocations;
    }

    private String underscorify(String str, List<Integer[]> locations) {
        StringBuilder finalStr = new StringBuilder();
        int lastAdded = 0;

        for (Integer[] location : locations) {
            finalStr.append(str, lastAdded, location[0]);
            finalStr.append("_")
                    .append(str, location[0], location[1])
                    .append("_");
            lastAdded = location[1];
        }

        finalStr.append(str.substring(lastAdded));

        return finalStr.toString();
    }
}

/*
 * Enter `str`:
 * testthis is a testtest to see if testestest it works
 * 
 * Enter `substring`:
 * test
 * 
 * Result:
 * _test_this is a _testtest_ to see if _testestest_ it works
 */
