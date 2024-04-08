import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] values = { 10, 20, 30, 40, 50, 25 };

        System.out.println("Input: ");
        System.out.println(Arrays.toString(values));

        AvlTree tree = new AvlTree();

        for (int value : values) {
            tree.root = tree.insert(tree.root, value);
        }

        System.out.println();
        System.out.println("Result: ");
        Helper helper = new Helper();
        List<Integer> result = helper.levelOrder(tree.root);
        System.out.println(result);
    }
}