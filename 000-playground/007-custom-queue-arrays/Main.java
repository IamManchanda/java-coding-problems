public class Main {
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
