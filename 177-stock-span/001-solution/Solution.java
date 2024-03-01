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
