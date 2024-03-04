public class Pair {
    int x, y;

    Pair(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public static String itemsToString(Pair[] arr) {
        int n = arr.length;
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i <= n - 1; i++) {
            sb.append("[" + arr[i].x + ", " + arr[i].y + "]");
            if (i != n - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
