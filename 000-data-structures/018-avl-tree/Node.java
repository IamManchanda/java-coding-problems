public class Node {
    int data, height;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.height = 1;
        this.left = null;
        this.right = null;
    }
}
