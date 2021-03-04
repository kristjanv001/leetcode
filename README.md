# Leetcode

All of my Leetcode solutions with some notes

## 1. Two Sum
O(N)T | O(N)S

hashmap

1. Loop over the array and check if target - current num exists in the hashmap
2. If yes, return the current index and target - current num index
3. Else, store the current number with its index

## 2. Add Two Numbers

carry, /, %

1. Create a new node (dummy), set dummy node to current, and create carry variable
2. while l1 or l2 or carry
3. Get val1 and val2 - use ternary
4. Create the digit: add val1 and val2 and carry, new carry / 10 and final digit by % 10
5. Insert the node
6. Update l1,l2 pointers to their next if not None (use ternary)
7. Return

## 3. Longest Substring Without Repeating Characters

hashmap container, sliding window

1. Start and end pointers at 0 and max length variable
2. Loop over str until the end pointer
3. If a character is not in hashmap, then store it, increment end pointer, and compare max length (use max function)
4. If not, then remove the recurring character and increment the start pointer 

## 5. Longest Palindromic Substring
O(n^2)T | O(1)S

odd / even palindromes, expand from the middle

1. Start and end indices to 0
2. Loop over the string and call a helper function on every character - check for both even and odd palindromes. We don't know whether the substring is even or odd, so we have to check for both. In this function, loop, while the string passed in, is not out of bounds and the left and right match - keep expanding the indices. If one of the conditions is no longer true, return the length of the maximum palindrome we got (right-left-1).
3. Use max() to compare both possible substrings. If we have a "racecar," then the odd will result, e.g., 7, while the even gives us 0. 
4. If we have a new max length (a new longer palindrome), update the start and end indices. We divide the current maximum length with 2 using the // operator. For 'start', we have to subtract 1 from the current max length. Otherwise, in some cases, we end up out of bounds.
5. Return a substring using our start and end indices. +1 to the end.

## 206. Reverse Linked List

3 pointers, shift all of them

1. Set p1 (None) and p2 (head) pointers
2. While p2
3. Create p3 pointer
4. Reversal! p2.next to p1
5. Update p1 to p2 and p2 to p3

## 237. Delete a Node in a Linked List

Just overwrite the val with the next

## 628. Maximum Product of Three Numbers

1. Sort the list
2. Compare the maximum of the last three and the first two + the last one
