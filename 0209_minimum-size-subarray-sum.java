class Solution {
    // O(N)T | O(1)S
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        
        int result = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++) {      
            sum += nums[i];    
            
            // We're trying to squeeze out the minimum.
            // So we compare the result with the length of the current subarray
            // and if it's smaller than our current, we update it.
            // Then we 'slide the window' forward and see if we can get even smaller length.
            while (sum >= target) {       
                result = Math.min(result, i + 1 - start) ;
                sum -= nums[start];
                start++;                    
            }    
        }
        
        // Return 0 if no such subarray exists
        if (result == Integer.MAX_VALUE) {
            return 0;
        } else {
            return result;
        }
    }
}
