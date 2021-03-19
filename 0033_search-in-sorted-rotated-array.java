class Solution {
    // O(logN)T | O(1)S
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        
        // [4,5,6,7,0,1,2], target = 0
        
        while (left <= right) {
            mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            // left side is sorted
            if (nums[left] <= nums[mid]) {
                // if left is smaller than target and target is smaller than mid, 
                // then we can eliminate the rest of the right-side
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                // if not, then the target must be in the right side, 
                // so we eliminate the other left
                } else {
                    left = mid + 1;
                }
            // right side is sorted
            } else {
                // same spiel as in left-side just we're dealing with the right-side
                if (nums[right] > nums[mid]) {
                    if (nums[right] >= target && target > nums[mid]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

        }
        return -1;
    }         
}
