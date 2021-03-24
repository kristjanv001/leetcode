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

## 20. Valid Parentheses

Stack, HashMap

1. Set up HashMap, Stack and brackets mappings.
2. Loop over the string.
3. If we're dealing with an opening bracket, add it to the stack.
4. Otherwise, if we're dealing with a closing bracket, use the bracket in the top of the stack as a key to get its value (closing bracket) from the hashmap and compare it to the current character. They better match. If not, return false. Return false also if the stack is empty.
5. Return stack.isEmpty(). If there's still something in the stack, it'll return false. The stack should be empty - every bracket should have found it's partner.

## 33. Search in Rotated Sorted Array

Check my comments on the code. 

Basically we're just figuring out which side of the array is sorted. We never know where our mid pointer lands, but we do know that in either case one side will be correctly sorted. Then, depending on that, we try to pinpoint on which side our target value should be located.

## 34. Find First and Last Position of Element in Sorted Array

2 binary search functions - to find low/high respectively

1. Set up result array and set index 0 and 1 to the outcome of the functions
2. Write the functions - they're almost identical. 
3. Just like a regular binary search, but instead of returning after finding the index, we just update it but keep updating the bounadaries - if at the next iteration we find another instance, then we update our index, but if not, then the binary search will end anyway without finding another index (and therefore not updating the result index variable).

## 53. Maximum Subarray

Joseph Kadane's algorithm

1. Set currMax and globalMax variables and initialize both to the first integer in the array
2. Loop over the array. At each position we find the max sum of the subarray. If the currMax is smaller than zero, reset it to the current integer. Keep adding to the currMax and check if currMax is greater than globalMax.

## 66. Plus One

1. Loop backwards and add one.
2. Return if current digit is less than 9, otherwise make it zero.
3. Make a +1 length array for the edge case and change only first element to zero as the array is initialized with zeroes anyway.

## 88. Merge Sorted Array

1. Set up a results array where we temporarily store elements.
2. Traverse both arrays and check which element is smaller - add that to result-array.
3. Loop over both arrays again separately to add remaining elements.
4. Overwrite the nums1 array with elements from the temporary - result array.

## 121. Best Time to Buy and Sell Stock

Joseph Kadane's algorithm

1. We keep adding to currentProfit as long as it's not negative. If it is, we just reset it to zero.
2. We update maxProfit if it's greater than the currentprofit.

## 141. Linked List Cycle

Robert Floyd's cycle finding algorithm

1. 2 pointers: fast and slow
2. Move slow one step and fast 2 steps
3. If slow == fast, there's a cycle

## 167 Two Sum II

L & R pointers, while loop, if-else

Since the array is sorted, we can use 2 pointers and move either the left or the right one depending whether the sum of those elements is greater or less than the target. If the sum is less, then we know that we need to move the left pointer, if it's greater then we need to move the right one to left.

## 189. Rotate Array

1. Write a helper function to do the reversals. A while-loop to reverse the start with end, then move pointers closer to each other. Don't forget to have a tmp to store the start value, so that we can later use it for the new end value.
3. Reverse the whole array.
4. Reverse the first half.
5. Reverse the second half.
6. Nb! k = k % nums.length.

## 206. Reverse Linked List

3 pointers, shift all of them

1. Set p1 (None) and p2 (head) pointers
2. While p2
3. Create p3 pointer
4. Reversal! p2.next to p1
5. Update p1 to p2 and p2 to p3

----

There's 3 parts to the reversal:
1. We set up 3 pointers: prev, head and next. 'next' will be set inside the while-loop.

prev head  next                       
null--1-->  2  -->  3  -->  4 --> null

2. We do the reversal by pointing the head to prev (null)
3. Then we update the pointers by shifting them forward

## 237. Delete a Node in a Linked List

Just overwrite the val with the next

## 239. Sliding Window Maximum

Comments in code

## 283. Move Zeroes

1. Set read/write indices
2. First while-loop: if the element at read index is not zero, tell the write index to write to its index whatever read index has. Move both. If the element at read index is zero, then only move the read index.
3. Second while-loop: After the read index reaches the end, let the write to overwrite all the rest with zeroes.

## 387. First Unique Character in a String

1. Set up a HashMap
2. Loop over the string once to store all characters and their count
3. Loop over the string again and check if there's a character with a count of 1 in the hashmap
4. By default return -1

## 498. Diagonal Traverse

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output:  [1,2,4,7,5,3,6,8,9]

The idea is to loop over the matrix and add the sum of indicies and the elements associated with these indicies as key-value pairs respectively to a hashmap. Why? Because the diagonals are represented by the sum of indicies. E.g., at indicies sum (i+j) of 2 we have 3,5 and 7. In order to get the 'snake'-like structure we reverse the elements if the key (sum of indicies) cleanly divides by 2.

1. Set up a HashMap and a result array
2. Loop over the matrix and add i+j as keys and a list of elements at these indicies as values. E.g., {0=[1], 1=[2,4], 2=[3,5,7], 3=[6,8], 4=[9]}.
3. Second part: reverse the values if the key divides by 2, then add all the values to the result array.

## 628. Maximum Product of Three Numbers

1. Sort the list
2. Compare the maximum of the last three and the first two + the last one

## 724. Find Pivot Index

1. Get the whole sum
2. Another loop, subtract elements j from the whole sum, compare left with right, keep increasing the left sum with j elements - works out like magic

## 747. Largest Number At Least Twice of Others

1. Get the index of the max number.
2. Loop over the array again and check if the max number is smaller than current number * 2 - if so, there's no point looping further, return -1.
