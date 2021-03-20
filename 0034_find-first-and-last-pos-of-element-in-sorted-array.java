class Solution {
    // O(logN)T | O(1)S
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findLeftIdx(nums, target);
        result[1] = findRightIdx(nums, target);
        
        return result;
    }
    
    public int findLeftIdx(int[] nums, int target) {
        int idx = -1;  
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        
        while (left <= right) {
            mid = left + (right - left) / 2;
      
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                idx = mid; 
                right = mid - 1;
            }
        }
        return idx;
    }
    
    public int findRightIdx(int[] nums, int target) {
        int idx = -1;  
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        
        while (left <= right) {
            mid = left + (right - left) / 2;
      
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                idx = mid; 
                left = mid + 1;
            }
        }
        return idx;
    }
    
}
