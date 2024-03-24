import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of items in `nums1[]`:");
        int n1 = sc.nextInt();

        System.out.println();
        System.out.println("Enter number of items in `nums2[]`:");
        int n2 = sc.nextInt();

        System.out.println();
        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];

        if (n1 == 0) {
            System.out.println("Entered `nums1[]` is empty");
        } else {
            System.out.println("Enter items of `nums1[]`: ");

            for (int i = 0; i < n1; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                nums1[i] = sc.nextInt();
            }
        }

        System.out.println();

        if (n2 == 0) {
            System.out.println("Entered `nums2[]` is empty");
        } else {
            System.out.println("Enter items of `nums2[]`: ");

            for (int i = 0; i < n2; i++) {
                System.out.print("Enter item " + (i + 1) + ": ");
                nums2[i] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Entered `nums1[]`: ");
        System.out.println(Arrays.toString(nums1));

        System.out.println();
        System.out.println("Entered `nums2[]`: ");
        System.out.println(Arrays.toString(nums2));

        // Solution
        Solution solution = new Solution();
        int[] result = solution.union(nums1, nums2);

        // Output
        System.out.println();
        System.out.println("Result: ");
        System.out.println(Arrays.toString(result));

        sc.close();
    }
}