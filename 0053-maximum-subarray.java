class Solution {
    public int maxSubArray(int[] nums) {
        int maxVal = nums[0];
        int currMax = nums[0];
        
        // Joseph Kadane's algorithm
        for (int i = 1; i < nums.length; i++) {
            if (currMax < 0) {
                currMax = nums[i];
            } else {
                currMax += nums[i];
            }
            
            if (maxVal < currMax) {
                maxVal = currMax;
            }
        }
        
        return maxVal;
    }
}
