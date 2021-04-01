class Solution {
    // O(n*m)T | O(1)S 
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0) {
            return "";
        }
        
        StringBuilder prefix = new StringBuilder();
        
        int i = 0;
      
        // Loop over the first string - we can pick  any tbh
        for (; i < strs[0].length(); i++) {           
            // j is 1 because we don't want to compare the first string with the first string
            for (int j = 1; j < strs.length; j++) {
                // Check for the bounds
                // Also, as soon as a character in our first string 
                // does not match a character at the i'th pos in any of the other strings, we're out
                if (strs[j].length() <= i || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return prefix.toString();
                }
            }
            // If we didn't return it means everything's OK and we can append characters to the stringbuilder
            prefix.append(strs[0].charAt(i));
        }
        return prefix.toString();
    }
}
