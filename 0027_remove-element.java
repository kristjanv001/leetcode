class Solution {
    // O(N)T | O(1)S
    public int removeElement(int[] nums, int val) {
        int read = 0; // fast
        int write = 0; // slow
        
        while (read < nums.length) {
            if (nums[read] != val) {
                nums[write] = nums[read];
                write++;
            }
            read++;
        }
        return write;
    }
}
