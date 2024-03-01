import java.util.*;

/**
 * Stock Span Problem
 * https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1
 */

public class Solution {
    public int[] calculateSpan(int price[], int n) {
        int[] S = new int[n];

        calculateSpan(price, n, S);

        return S;
    }

    private void calculateSpan(int price[], int n, int S[]) {
        Stack<Integer> st = new Stack<>();
        S[0] = 1;
        st.push(0);

        for (int i = 1; i <= n - 1; i++) {
            int currentPrice = price[i];

            while (!st.isEmpty() && price[st.peek()] <= currentPrice) {
                st.pop();
            }

            if (st.isEmpty()) {
                S[i] = i + 1;
            } else {
                int prevHighIdx = st.peek();
                S[i] = i - prevHighIdx;
            }

            st.push(i);
        }
    }
}

/*
 * Entered items in `price`:
 * [100, 80, 60, 70, 60, 75, 85]
 * 
 * Number of items in `price`: 7
 * 
 * Result:
 * [1, 1, 1, 2, 1, 4, 6]
 */

/*
 * Entered items in `price`:
 * [10, 4, 5, 90, 120, 80]
 * 
 * Number of items in `price`: 6
 * 
 * Result:
 * [1, 1, 2, 4, 5, 1]
 */

/*
 * Entered items in `price`:
 * [100, 80, 60, 70, 60, 85, 100]
 * 
 * Number of items in `price`: 7
 * 
 * Result:
 * [1, 1, 1, 2, 1, 5, 7]
 */
