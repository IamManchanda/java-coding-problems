public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
        ll.removeLast(2);
        ll.print();
        System.out.println(ll.checkPalindrome());
        ll.add(3);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
