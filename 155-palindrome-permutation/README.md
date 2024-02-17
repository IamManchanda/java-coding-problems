# Palindrome Permutation

> Question from Cracking the Coding Interview, Chapter 1.

Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

Example:

```plaintext
Input: Tact Coa
Output: True (permutations: "taco cat", "atco cta", etc.)
```

## Solution

This is a question where it helps to figure out what it means for a string to be a permutation of a palindrome. This is like asking what the "defining features" of such a string would be.

A Palindrome is a string that is the same forwards and backwards. Therefore, to decide if a string is a permutation of a palindrome, we need to know if it can be written such that it's the same forwards and backwards.

What does it take to be able to write a set of characters the same way forwards and backwards? We need to have an even number of almost all characters, so that half can be on one side and half can be on the other side. At most one character (the middle character) can have an odd count.

For example, we know `tactcoapapa` is a permutation of a palindrome because it has two Ts, four As, two Cs, two Ps, and one O. That O would be the center of all possible palindromes.

> To be more precise, strings with even length (after removing all non-letter characters) must have all even counts of characters. Strings of an odd length must have exactly one character with an odd count. Of course, an "even" string can't have an odd number of exactly one character, otherwise it wouldn't be an even-length string (an odd number + many even numbers = odd number). It's therefore sufficient to say that, to be a permutation of a palindrome, a string can have no more than one character that is odd. This will cover both the odd and the even cases.

This leads us to our first algorithm:

### Solution 1

Implementing this algorithm is straightforward. We use a hash table to count how many times each character appears. Then, we iterate through the hash table and ensure that no more than one character has an odd count.

```java
import java.util.*;

boolean isPermutationOfPalindrome(String phrase) {
    // build the table of character counts
    Map<Character, Integer> table = buildCharFrequencyTable(phrase);
    
    // check that no more than one character has an odd count
    return checkMaxOneOdd(table);
}

Map<Character, Integer> buildCharFrequencyTable(String phrase) {
    Map<Character, Integer> table = new HashMap<>();

    // iterate through the phrase and count how many times each character appears
    for (char c : phrase.toCharArray()) {
        if (Character.isLetter(c)) {
            table.put(c, table.getOrDefault(c, 0) + 1);
        }
    }
    
    return table;
}

boolean checkMaxOneOdd(Map<Character, Integer> table) {
    boolean foundOdd = false;

    // iterate through the table and ensure that no more than one character has an odd count
    for (int count : table.values()) {
        if (count % 2 == 1) {
            if (foundOdd) {
                return false;
            }
            foundOdd = true;
        }
    }

    return true;
}
```

This algorithm takes O(N) time, where N is the length of the string.

### Solution 2

We can't optimize the big O time here since any algorithm will always have to look through the entire string. However, we can make smaller incremental improvements. Because this is a relatively simple problem, it can be worthwhile to discuss small optimizations atleast some tweaks.

Instead of checking the number of odd counts at the end, we can check as we go along. Then, as soon as we get to the end, we have our answer.

```java
// get the numeric value of 'a' and 'z'
final int a = Character.getNumericValue('a');
final int z = Character.getNumericValue('z');

boolean isPermutationOfPalindrome(String phrase) {
    // initialize count of odd characters
    int countOdd = 0;

    // initialize table of character counts
    int[] table = new int[z - a + 1];

    // iterate through the phrase and count how many times each character appears
    for (char c : phrase.toCharArray()) {
        // get the character number
        int x = getCharNumber(c);

        // if the character is a letter, we increment the count of that character and update the count of odd characters
        if (x != -1) {
            // increment the count of that character
            table[x]++;
            
            // update the count of odd characters
            // we, increment if the count is odd
            // and, decrement if the count is even
            countOdd += table[x] % 2 == 1 ? 1 : -1;
        }
    }

    // check that no more than one character has an odd count
    return countOdd <= 1;
}

int getCharNumber(Character c) {
    // get the numeric value of the character
    int val = Character.getNumericValue(c);

    // get the numeric value of 'a' and 'z'
    if (a <= val && val <= z) {
        // return the difference between the numeric value of the character and the numeric value of 'a'
        return val - a;
    }
    
    // return -1 if the character is not a letter
    return -1;
}
```

It's important to be very clear here that this is not necessarily more optimal. It has the same big O time and might be even slightly slower. We have eliminated a final iteration through the hash table, but now we have to run a few extra lines of code for each character in the string.

We should discuss this with our interviewer as an alternate but not necessarily more optimal solution.

### Solution 3

If you think more deeply about this problem, we might notice that we don't actually need to know the counts. We just need to know if the count is even or odd. Think about flipping a light on/off (that is initially off). If the light winds up in the off state, we don't know how many times we flipped it, but we do know it was an even count.

Given this, we can use a single integer (as a bit vector). When we see a letter, we map it to an integer between 0 and 25 (assuming an English alphabet). Then we toggle the bit at that value. At the end of the iteration, we check that at most one bit in the integer is set to 1.

We can easily check that no bits in the integer are 1: just compare the integer to 0. There is actually a very elegant way to check that an integer has exactly one bit set to 1.

Picture an integer like 00010000. We could of course shift the integer repeatedly to check that there's only a single 1. Alternatively, if we subtract 1 from the number, we get 00001111. What's notable about this is that there is no overlap between the original number (as opposed to say 00101000, which, when we subtract 1 from, we get 00100111). So, we can check to see that a number has exactly one 1 because if we subtract 1 from it and then AND it with the new number, we should get 0.

```plaintext
00010000 - 1 = 00001111
00010000 & 00001111 = 0
```

This leads us to our final implementation.

```java
// get the numeric value of 'a' and 'z'
final int a = Character.getNumericValue('a');
final int z = Character.getNumericValue('z');

boolean isPermutationOfPalindrome(String phrase) {
    // create a bit vector for the string
    int bitVector = createBitVector(phrase);

    // check that at most one bit in the integer is set to 1
    return bitVector == 0 || checkExactlyOneBitSet(bitVector);
}

// create a bit vector for the string.
// For each letter with value i, toggle the ith bit.
int createBitVector(String phrase) {
    // initialize the bit vector
    int bitVector = 0;

    // iterate through the phrase and toggle the bit for each letter
    for (char c : phrase.toCharArray()) {
        // get the numeric value of the character
        int x = getCharNumber(c);

        // toggle the bit for the letter
        bitVector = toggle(bitVector, x);
    }

    // return the bit vector
    return bitVector;
}

int getCharNumber(Character c) {
    // get the numeric value of the character
    int val = Character.getNumericValue(c);

    // get the numeric value of 'a' and 'z'
    if (a <= val && val <= z) {
        // return the difference between the numeric value of the character and the numeric value of 'a'
        return val - a;
    }
    
    // return -1 if the character is not a letter
    return -1;
}

// toggle the ith bit in the integer
int toggle(int bitVector, int index) {
    // if the index is less than 0, return the bit vector
    if (index < 0) {
        return bitVector;
    }

    // create a mask with the ith bit turned on
    int mask = 1 << index;

    if ((bitVector & mask) == 0) {
        // if the ith bit is off, turn it on
        bitVector |= mask;
    } else {
        // if the ith bit is on, turn it off
        bitVector &= ~mask;
    }

    // return the bit vector
    return bitVector;
}

// check that exactly one bit is set by subtracting one from the integer and ANDing it with the original integer
boolean checkExactlyOneBitSet(int bitVector) {
    return (bitVector & (bitVector - 1)) == 0;
}
```

Like the other solutions, this is O(N).

It's interesting to note a solution that we did not explore. We avoided solutions along the lines of "create all possible permutations and check if they are palindromes." While such a solution would work, it's entirely infeasible in the real world. Generating all permutations requires factorial time (which is actually worse than exponential time), and it is essentially infeasible to perform on strings longer than about 10-15 characters. This (impractical) solution is mentioned here because a lot of candidates will hear a problem like this and say, "In order to check if A is in group B, I must know everything that is in B and then check if one of the items equals A." That's not always the case, and this problem is a simple demonstration of it. You don't need to generate all permutations in order to check if one is a palindrome.
