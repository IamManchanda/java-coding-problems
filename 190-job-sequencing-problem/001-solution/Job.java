public class Job {
    int id, profit, deadline;

    Job(int x, int y, int z) {
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }

    public static String itemsToString(Job[] arr) {
        int n = arr.length;
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        for (int i = 0; i <= n - 1; i++) {
            sb.append("[" + arr[i].id + ", " + arr[i].deadline + ", " + arr[i].profit + "]");
            if (i != n - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
