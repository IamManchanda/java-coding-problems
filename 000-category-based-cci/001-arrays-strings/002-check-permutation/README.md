# Check Permutation

Given two strings, write a method to decide if one is a permutation of the other.

## Solution

Like in many questions, we should confirm some details with our interviewer. We should understand if the permutation comparison is case sensitive. That is: is God a permutation of dog? Additionally, we should ask if whitespace is significant. We will assume for this problem that the comparison is case sensitive and whitespace is significant. So, "god " is different from "dog".

Observe first that strings of different lengths cannot be permutations of each other. There are two easy ways to solve this problem, both of which use this optimization.

### Solution 1: Sort the strings

If two strings are permutations, then we know they have the same characters, but in different orders. Therefore, sorting the strings will put the characters from two permutations in the same order. We just need to compare the sorted versions of the strings.

```java
import java.util.*;

boolean checkPermutation(String s, String t) {
  int sn = s.length(), tn = t.length();

  // If the strings are of different lengths, they cannot be permutations
  if (sn != tn) {
    return false;
  }

  // Sort the strings and compare them
  return sort(s).equals(sort(t));
}

String sort(String s) {
  // Convert the string to a character array
  char[] content = s.toCharArray();

  // Sort the array
  Arrays.sort(content);

  // Convert the array back to a string
  return new String(content);
}
```

Though this algorithm is not as optimal in some senses. It's clean, simple and easy to understand. In a practical sense, this may very well be a superior way to implement the problem.

However, if efficiency is very important, we can implement a more optimal solution.

### Solution 2: Check if the two strings have identical character counts

We can also use the definition of a permutation - two words with the same character counts - to implement this algorithm. We simply iterate through this code, counting how many times each character appears. Then, afterwards, we compare the two arrays.

```java
final int ASCII_SIZE = 128;

boolean permutation(String s, String t) {
  int sn = s.length(), tn = t.length();

  // If the strings are of different lengths, they cannot be permutations
  if (sn != tn) {
    return false;
  }

  // Letters array to store the count of each character
  int[] letters = new int[ASCII_SIZE];

  for (int i = 0; i <= sn - 1; i++) {
    // Count the number of each character in s
    letters[s.charAt(i)]++;
  }

  for (int i = 0; i <= tn - 1; i++) {
    // Count the number of each character in t
    letters[t.charAt(i)]--;

    // If the count is less than 0, the strings are not permutations
    if (letters[c] < 0) {
      return false;
    }
  }

  // If no character is repeated, return true
  return true;
}
```
