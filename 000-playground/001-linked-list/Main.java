public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(2);
        ll.addFirst(1);
        ll.add(2);
        ll.add(1);
        print(ll);
        ll.removeLast(2);
        print(ll);
        ll.add(3);
        print(ll);
        ll.removeLast();
        print(ll);
    }

    private static void print(LinkedList ll) {
        System.out.println();
        ll.print();
        System.out.println("Size: " + ll.size());
        System.out.println("Is Palindrome?: " + ll.checkPalindrome());
    }
}
