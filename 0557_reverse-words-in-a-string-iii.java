class Solution {
    // O(N)T | O(N)S
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        
        int start = 0;
        
        
        for (int i = 0; i < chars.length; i++) {
            
            // If we encounter a space, 
            // it means we reached the end of the word.
            // So, we feed the start and end index to the swap function
            // and set i to the beginning of next word
            if (chars[i] == ' ' ) {
                swap(start, i - 1, chars);
                start = i + 1;
            }
            
            // There is no space after the last word,
            // so we have a special condition for that
            if (i == chars.length - 1) {
                swap(start, i, chars);
            }
            
        }
        // valueOf() method returns the string representation 
        // of the argument passed
        return String.valueOf(chars);

    }
    
    // A regular swap function
    // We replace the first char with the last one and move the pointers closer
    private void swap(int beginning, int end, char[] characters) {
		while(beginning < end) {
    		char temp = characters[beginning];
    		characters[beginning] = characters[end];
    		characters[end] = temp;
    		beginning++;
    		end--;
    	}
	}
}
