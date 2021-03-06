class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        
        int[] indecies = new int[2];
        
        while (left <= right) {
            
            int sum = numbers[left] + numbers[right];
            
            if (sum > target) {
                right--;
            } else if(sum < target) {
                left++;
            } else {
                indecies[0] = left + 1;
                indecies[1] = right + 1;
                return indecies;
            }       
        }
        return indecies;
    }
}
