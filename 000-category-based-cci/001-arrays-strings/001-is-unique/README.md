# Is Unique

Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

## Solution

We should first ask our interviewer if the string is an ASCII string or a Unicode string. Asking this question will show an eye for detail and a solid foundation in computer science. We'll assume for simplicity the character set is ASCII. If this assumption is not valid, we would need to increase the storage size.

One solution is to create an array of boolean values, where the flag at index i indicates whether character i in the alphabet is contained in the string. The second time you see this character you can immediately return false.

We can also immediately return false if the string length exceeds the number of unique characters in the alphabet. After all, you can't form a string of 280 unique characters out of a 128-character alphabet.

It's also okay to assume 256 characters. This would be the case in extended ASCII. You should clarify your assumptions with your interviewer.

This code below implements this algorithm:

```java
final int ASCII_SIZE = 128;

boolean isUniqueChars(String str) {
  int n = str.length();

  // If the string length exceeds the number of unique characters in the alphabet, return false
  if (n > ASCII_SIZE) {
    return false;
  }

  // Create a boolean array to store the presence of each character
  boolean[] char_set = new boolean[ASCII_SIZE];

  // Iterate for each character in the string
  for (int i = 0; i <= n - 1; i++) {
    // Get the ASCII value of the character
    int val = str.charAt(i);

    // If the character is already present in the string, return false
    if (char_set[val]) {
      return false;
    }

    // Set the character as present in the string
    char_set[val] = true;
  }

  // If no character is repeated, return true
  return true;
}
```

The time complexity for this code is O(n), where n is the length of the string. The space complexity is O(1).

If you didn't want to assume the character set is fixed, you could express the complexity as O(c) space and O(min(c, n)) time, where c is the size of the character set.

We can reduce our space usage by a factor of eight by using a bit vector. We will assume, in the below code, that the string only uses the lowercase letters a through z. This will allow us to use just a single int.

```java
boolean isUniqueChars(String str) {
  int n = str.length();

  // Assuming character set is ASCII (128 characters)
  int checker = 0;

  // Iterate for each character in the string
  for (int i = 0; i <= n - 1; i++) {
    // Get the ASCII value of the character as an integer
    int val = str.charAt(i) - 'a';

    // Create a shift of 1 by val
    int shift = 1 << val;

    // If the character is already present in the string, return false
    if ((checker & shift) > 0) {
      return false;
    }

    // Set the character as present in the string
    checker |= shift;
  }

  // If no character is repeated, return true
  return true;
}
```

If we can't use additional data structures, we can do the following:

1. Compare every character of the string to every other character of the string. This will take O(n^2) time and O(1) space.

2. If we are allowed to modify the input string, we could sort the string in O(n log n) time and then linearly check the string for neighboring characters that are identical. Careful, though: many sorting algorithms take up extra space.

These solutions are not as optimal in some respects, but might be better depending on the constraints of the problem.
