# Leetcode

All of my Leetcode solutions

## 1. Two Sum

hashmap

1. Loop over the array and check if target - current num exists in the hashmap
2. If yes, return the current index and target - current num index
3. Else, store the current number with its index

## 2. Add Two Numbers

carry, /, %

1. Create a new node (dummy), set dummy node to current and create carry variable
2. while l1 or l2 or carry
3. Get val1 and val2 - use ternary
4. Create the digit: add val1 and val2 and carry, new carry / 10 and final digit by % 10
5. Insert the node
6. Update l1,l2 pointers to their next if not None (use ternary)
7. Return 

## 206. Reverse Linked List

3 pointers, shift all of them

1. Set p1 (None) and p2 (head) pointers
2. While p2
3. Create p3 pointer
4. Reversal! p2.next to p1
5. Update p1 to p2 and p2 to p3
