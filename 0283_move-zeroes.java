class Solution {
    public void moveZeroes(int[] nums) {
        
        int read = 0; // fast
        int write = 0; // slow
        
        // First loop, we keep moving the read pointer 
        // until it encounters a number that is not 0. 
        // Then we write the value at write and 
        // increment the write pointer. 
        // We increment the read pointer in any case.
        while (read < nums.length) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
            read++;
        }
        
        // Second loop, we just overwrite all the 
        // remaining elements with zeroes
        while (write < nums.length) {
            nums[write] = 0;
            write++;
        }
    }
}
