class Solution {
    // O(N)T | O(1)S
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int current = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                current++;
                
                if (current > counter) {
                    counter = current;
                }
            // if current number is not 1 anymore, 
            // then reset the current counter
            } else {
                current = 0;
            }
        }
        return counter;
    }
}
