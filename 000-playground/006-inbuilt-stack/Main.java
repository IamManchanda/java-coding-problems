import java.util.*;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();
        // or, Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
