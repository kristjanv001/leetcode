class Solution {
    // O(n)T | O(1)S
    public void reverseString(char[] s) {
        
        // Declare start/end pointers and 
        // as we replace elements we move these pointers closer to the middle
        
        int start = 0;
        int end = s.length - 1;
        
        // If the pointers meet at the middle, we break
        while (start < end) {
            
            // We need a temp to store the value we're going to overwrite
            char tmp = s[start];
            // Replace!
            s[start] = s[end];
            s[end] = tmp;
            // Move pointers closer to each-other
            start++;
            end--;
        }
    }
}
