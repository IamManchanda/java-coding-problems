/**
 * Merge Sort (Array of Strings)
 * 
 * Time complexity: O(n log n)
 * Space complexity: O(n)
 */

public class Solution {
    public String[] mergeSort(String[] arr) {
        return sort(arr, 0, arr.length - 1);
    }

    private String[] sort(String[] arr, int si, int ei) {
        if (si == ei) {
            return new String[] { arr[si] };
        }

        int mid = findMidIndex(si, ei);
        String[] left = sort(arr, si, mid);
        String[] right = sort(arr, mid + 1, ei);

        return merge(left, right);
    }

    private String[] merge(String[] left, String[] right) {
        int l = left.length;
        int r = right.length;
        String[] result = new String[l + r];

        int i = 0, j = 0, k = 0;

        while (i < l && j < r) {
            if (isAlphabeticallySmaller(left[i], right[j])) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < l) {
            result[k++] = left[i++];
        }

        while (j < r) {
            result[k++] = right[j++];
        }

        return result;
    }

    private boolean isAlphabeticallySmaller(String str1, String str2) {
        return str1.compareTo(str2) < 0;
    }

    private int findMidIndex(int start, int end) {
        // Avoids overflow compared to (start + end) / 2
        return start + (end - start) / 2;
    }
}

/*
 * Entered `arr`:
 * [sun, earth, mars, mercury]
 * 
 * Result:
 * [earth, mars, mercury, sun]
 */
