class Solution {
    public void moveZeroes(int[] nums) {
        int read = 0;
        int write = 0;
        
        while (read <= nums.length - 1) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write++;
            }
            read++;
        }
        
        while (write <= nums.length - 1) {
            nums[write] = 0;
            write++;
        }
        
    }
}
