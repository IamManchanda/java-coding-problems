public class Main {
    public static void main(String[] args) {
        int binAnd = 5 & 6;
        System.out.println("5 & 6 = " + binAnd); // 4

        int binOr = 5 | 6;
        System.out.println("5 | 6 = " + binOr); // 7

        int binXor = 5 ^ 6;
        System.out.println("5 ^ 6 = " + binXor); // 3

        int binNot = ~5;
        System.out.println("~5 = " + binNot); // -6

        int binLeftShift = 5 << 2;
        System.out.println("5 << 2 = " + binLeftShift); // 20
        // Tip: a << b = a * 2^b

        int binRightShift = 5 >> 2;
        System.out.println("5 >> 2 = " + binRightShift); // 1
        // Tip: a >> b = a / 2^b
    }
}
