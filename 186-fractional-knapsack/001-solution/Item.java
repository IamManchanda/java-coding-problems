public class Item {
    int value, weight;

    Item(int x, int y) {
        this.value = x;
        this.weight = y;
    }

    public static String itemsToString(Item[] arr) {
        int n = arr.length;
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i <= n - 1; i++) {
            sb.append("[" + arr[i].value + ", " + arr[i].weight + "]");
            if (i != n - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
