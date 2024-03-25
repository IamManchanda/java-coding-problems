public class Main {
    public static void main(String[] args) {
        String[] words = { "the", "a", "there", "their", "any", "thee" };

        Trie t = new Trie();

        for (String word : words) {
            t.insert(word);
        }

        System.out.println(t.search("thee")); // true
        System.out.println(t.search("thor")); // false
        System.out.println(t.search("any")); // true
        System.out.println(t.search("an")); // false
    }
}