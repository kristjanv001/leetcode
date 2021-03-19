class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        // Set up the results array where we store the final max element of each window
        // Also, set up a deque where we temporarily store the indices of 'potential candidates'
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<Integer>();
        
        if (nums.length > 0) {      
            if (nums.length < k) {return result;}
            
            // We declare the 'i' outside, so we won't have scope issues.
            // First, we loop over the array from indices 0 to k - the size of the window.
            // The idea is first to remove any indices from the deque 
            // which' corresponding elements in nums are smaller than the one at the end of
            // the decue. We keep doing this until the deque is empty or the element at the back is 
            // greater than our current element.
            // Finally, when the indices of smaller elements are cleared off, we can add
            // the index of our current element to the decue.
            int i = 0;
            for (; i < k; i++) {
                while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                    deque.removeLast();
                }               
                deque.addLast(i);
            }

            // i = k; // at this point, 'i' will be equal to k (window size);
            // First thing we do, is to save the largest element - which is identified by the saved
            // index - from the front of the decue to our results array. 
            // Remember, we cleared off all the indices of smaller values from the back, 
            // so the largest one prevailed. Because we cleared them off from the end of the
            // deque, the largest remained will be in the front. So we can use peek() to get
            // the first item.
            // With the first while loop, we're removing the indices that are no longer
            // part of the current 'window'. We can't keep them around, as the elements
            // corresponding to these indices are already added to our results array. We have
            // to use removeFirst()
            // Second while loop is the same as the while loop in our first for-loop. We keep
            // repeating the same process.
            for (; i < nums.length; i++) {
                result[i - k] = nums[deque.peek()];
                
                while (!deque.isEmpty() && deque.peek() <= i - k) {
                    deque.removeFirst();
                }
                
                while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                    deque.removeLast();
                }           
                deque.addLast(i);
            }
            
            // Finally, we add the result from the last window - just as we did in the beginning
            // of the second for-loop. 
            result[i - k] = nums[deque.peek()];
            return result;
            
        } else {
            return result;
        }
    }
}
