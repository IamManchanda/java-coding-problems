import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> mainList = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list1.add(i);
            list2.add(i * 2);
            list3.add(i * 3);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println();
        System.out.println("Entered `mainList`");
        System.out.println(mainList);

        // Solution & Output
        Solution solution = new Solution();
        System.out.println();
        System.out.println("Result:");
        solution.printMatrix(mainList);
    }
}