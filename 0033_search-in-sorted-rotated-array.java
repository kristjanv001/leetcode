class Solution {
    // O(N)T | O(1)S
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        
        while (left <= right) {
            mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            if (target < nums[mid]) {
                if (nums[left] <= nums[mid] && target < nums[left]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            
            if (target > nums[mid]) {
                if (nums[right] >= nums[mid] && target > nums[right]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
