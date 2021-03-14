class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> hashmap = new HashMap<Character, Character>();
        Stack<Character> stack = new Stack<Character>();
        
        hashmap.put('(', ')');
        hashmap.put('{', '}');
        hashmap.put('[', ']');
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (hashmap.containsKey(currentChar)) {
                stack.push(currentChar);
            } else if (hashmap.containsValue(currentChar)) {
                if (stack.isEmpty() || hashmap.get(stack.pop()) != currentChar) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
