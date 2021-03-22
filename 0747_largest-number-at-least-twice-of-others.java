class Solution {
    // O(N)T | O(1)S
    public int dominantIndex(int[] nums) {
        int maxNumIdx = 0;
        
        // Find the max number
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxNumIdx]) {
                maxNumIdx = i;
            }
        }
        
        // As soon as the max number is less than current number * 2, 
        // we're out of the loop and return -1
        for (int j = 0; j < nums.length; j++) {
            if (maxNumIdx != j && nums[maxNumIdx] < 2 * nums[j]) {
                return -1;
            } 
        }
        return maxNumIdx;
    }
}
