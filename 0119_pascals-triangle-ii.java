class Solution {
    // O(k^2)T | O(k)S where k is the the elements in the list at a given rowIndex
    // Essentially, elements in the list will be k + 1
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i <= rowIndex; i++) {      
            // The very first number is always 1
            result.add(0, 1);

            // We enter the loop if i becomes 2 -> result is [1, 1, 1] 
            // Then we replace the value at j, so result becomes [1, 2, 1]            
            for (int j = 1; j < i; j++) {
                result.set(j, result.get(j) + result.get(j + 1));
            }
        }
        return result;
    }
}
