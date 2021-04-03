class Solution {
    // O(NlogN) + O(N) = O(NlogN)T | O(N)S ?
    // Sorting takes NlogN time in Java
    // As for space, we are increasing the sum with every other item (N/2)
    public int arrayPairSum(int[] nums) {
        
        // Sort first
        Arrays.sort(nums);
        int sum = 0;
        
        // We only care about every other item
        // This way we get the min of every pair
        // E.g. in [1,2,3,4] 
        // 1 is the min of first pair, 3 for second etc.
        for (int i = 0; i < nums.length - 1; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
