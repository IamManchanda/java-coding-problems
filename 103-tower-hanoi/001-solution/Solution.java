/**
 * Tower of Hanoi
 * 
 * Approach: Recursion
 * - Time complexity: O(2^n) { 2^n - 1 moves}
 * - Space complexity: O(n)
 */

public class Solution {
    public void towerOfHanoi(int n) {
        towerOfHanoi(n, "A", "B", "C");
    }

    private void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 0) {
            return;
        }

        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }
}

/*
 * Enter the number of disks:
 * 3
 * 
 * Result:
 * Transfer disk 1 from A to C
 * Transfer disk 2 from A to B
 * Transfer disk 1 from C to B
 * Transfer disk 3 from A to C
 * Transfer disk 1 from B to A
 * Transfer disk 2 from B to C
 * Transfer disk 1 from A to C
 */
