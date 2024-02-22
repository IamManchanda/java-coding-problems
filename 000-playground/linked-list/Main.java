public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 3);
        ll.print();
        ll.removeFirst();
        ll.print();
        System.out.println("Size: " + ll.size());
    }
}
