class Solution {
    public int[] plusOne(int[] digits) {
      
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += 1;

            if (digits[i] <= 9) {
                return digits;
            }
            digits[i] = 0;
        }
        
        // edge case
        int[] returnArray = new int[digits.length + 1];
        returnArray[0] = 1;
        return returnArray;
    }
}
