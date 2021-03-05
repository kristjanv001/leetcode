// O(N)T | O(1)S
class Solution {
    public int maxArea(int[] height) {
        int lPtr = 0;
        int rPtr = height.length-1;
        int max = 0;
        
        while (lPtr < rPtr) {
            if(height[lPtr] < height[rPtr]){
                max = Math.max(max, height[lPtr] * (rPtr - lPtr));
                lPtr ++;
            } else {
                max = Math.max(max, height[rPtr] * (rPtr - lPtr));
                rPtr --;
            }
        }
        return max;
    }
}
