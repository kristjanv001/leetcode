# Leetcode

Some of my Leetcode solutions with some notes

## 1. Two Sum

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
4. If it is, then remove the recurring character and increment the start pointer 

## 5. Longest Palindromic Substring

odd / even palindromes, expand from the middle

1. Start and end indices to 0
2. Loop over the string and call a helper function on every character - check for both even and odd palindromes. We don't know whether the substring is even or odd, so we have to check for both. In this function, loop, while the string passed in, is not out of bounds and the left and right match - keep expanding the indices. If one of the conditions is no longer true, return the length of the maximum palindrome we got (right-left-1).
3. Use max() to compare both possible substrings. If we have a "racecar," then the odd will result, e.g., 7, while the even gives us 0. 
4. If we have a new max length (a new longer palindrome), update the start and end indices. We divide the current maximum length with 2 using the // operator. For 'start', we have to subtract 1 from the current max length. Otherwise, in some cases, we end up out of bounds.
5. Return a substring using our start and end indices. +1 to the end.

## 11. Container with Most Water

2 pointers, re-calc area at each step

1. Set left and right pointers and current max variable
2. While the pointers have not 'touched' check which of the pillars is higher to use that to calculate the area (if/else). Use Math.max to update the max area. Update pointers.
3. return max

## 15. 3Sum

Two Sum II mechanics (l & r pointers), HashSet to avoid dupes

1. Sort the array
2. Use HashSet, so we don't have to worry about dupes
3. Set up a for-loop. Loop until nums.length-2 because we're looking fors sets of 3 and we don't want to go out of bounds.
4. Set up left and right pointers. Left pointer is i+1, because we don't want to include the same item to the resulting list.
5. Set up a while loop (similar to Two Sum II)
6. Declare a sum variable. It'll be the result of current value plus the ones on the left/right pointers.
7. If-else statements similar to Two Sum II. We're checking if sum is smaller or greater than zero and moving the pointers accordingly.
8. Return new Arraylist passing in the HashSet

## 19. Remove Nth Node From End of List

Fast / slow pointer, n nodes apart

1. Create a dummy node, so that we have a reference to the head (edge cases).
2. Set up slow and fast pointers.
3. Set the fast pointer n nodes apart from the slow pointer.
4. Traverse the lsit with both pointers until the fast one gets to the end. Since we set them n nodes apart, the slow one will be exactly in the right spot.
5. Remove the node.
6. Return dummy.next (head ref).

## 167 Two Sum II

L & R pointers, while loop, if-else

Since the array is sorted, we can use 2 pointers and move either the left or the right one depending whether the sum of those elements is greater or less than the target. If the sum is less, then we know that we need to move the left pointer, if it's greater then we need to move the right one to left.

## 206. Reverse Linked List

3 pointers, shift all of them

1. Set p1 (None) and p2 (head) pointers
2. While p2
3. Create p3 pointer
4. Reversal! p2.next to p1
5. Update p1 to p2 and p2 to p3

## 237. Delete a Node in a Linked List

Just overwrite the val with the next

## 239. Sliding Window Maximum

Comments in code

## 628. Maximum Product of Three Numbers

1. Sort the list
2. Compare the maximum of the last three and the first two + the last one
