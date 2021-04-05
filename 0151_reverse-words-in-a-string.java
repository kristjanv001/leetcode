class Solution {
    // O(N)T | O(N)S
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        
        // Loop over the string
        for (int i = 0; i < s.length(); i++) {
            
            // Iterate until we hit the beginning of the word
            if (s.charAt(i) == ' ') {
                continue;
            }
            
            // Then mark the position as the 'start'
            int start = i;
            
            // We have the start pointer, now we keep moving i 
            // until we hit the end of the word
            while (i < s.length() && s.charAt(i) != ' ') {
                i++;
            }
            
            // If we haven't inserted anything to the StringBuilder
            if (result.length() == 0) {
                
                // Then we simply take the word (substring) and insert it to index 0
                result.insert(0, s.substring(start, i));
                
            // Else - there already is a word - we insert a space and then the substring
            } else {
                result.insert(0, " ").insert(0, s.substring(start, i));
            }
            
        }
        return result.toString();
    }
}
