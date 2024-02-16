# Pair Sum in Rotated Sorted Array

## Formula for Solution 001: Two Pointers

> (l, r on opposite sides of the pivot)

As it's a rotated sorted array,

we first find pivot and then:

- l will be on right side of the pivot,
- r will be on the left side of the pivot.

Then, we move l and r like this:

- l++ => (l + 1) % n
- r-- => (n + r - 1) % n
