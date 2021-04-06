class Solution {
    // O(N)T | O(1)S
    public int removeDuplicates(int[] nums) {
        
        if (nums.length == 0) {
            return 0;
        }
        
        int write = 0; // slow pointer
        int read = 0; // fast pointer
        
        // We move the read forward until it encounters a character 
        // that is not the same as in write. 
        // Then we move write one notch and write the el. at that position 
        // with the value of read. Wash, rinse & repeat!
        while (read < nums.length) {       
            if (nums[read] != nums[write]) {
                write++;
                nums[write] = nums[read];
            }
            read++;
        } 
        write++;
        return write;
    }
}
