class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> characters = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            if (characters.containsKey(s.charAt(i))) {
                characters.put( s.charAt(i), characters.get(s.charAt(i))+1 );
            } else {
                characters.put(s.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (characters.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }        
}
