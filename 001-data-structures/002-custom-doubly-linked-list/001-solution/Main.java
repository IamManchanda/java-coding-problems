public class Main {
    public static void main(String[] args) {
        CustomLinkedList dll = new CustomLinkedList();
        print(dll);
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);
        print(dll);
        dll.addFirst(0);
        dll.addLast(6);
        print(dll);
        dll.removeFirst();
        dll.removeLast();
        print(dll);
        dll.reverse();
        print(dll);
    }

    private static void print(CustomLinkedList ll) {
        System.out.println();
        ll.print();
        System.out.println("Size: " + ll.size());
    }
}
