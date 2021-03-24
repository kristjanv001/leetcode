class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        if (matrix.length == 0) {
            return result;
        }
        
        // Declare initial boundaries
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        // Size of the matrix
        int size = matrix.length * matrix[0].length;
        
        // While our result's size has not reached the size of the matrix,
        // we need to keep adding elements to the result list
        while (result.size() < size) {
            
            // Traverse the top left first
            for (int i = left; i <= right && result.size() < size; i++) {    
                
                // Add all elements from the (current) top row
                result.add(matrix[top][i]);
            }
            
            // Make sure we don't add the same el twice,
            // so we move top down one notch
            top++;
            
            // Moving from top right to bottom
            for (int i = top; i <= bottom && result.size() < size; i++) {
                result.add(matrix[i][right]);
            }
            
            // Make sure we don't add the bottom right el twice,
            // when we're about to traverse to left
            right--;
            
            for (int i = right; i >= left && result.size() < size; i--) {
                
                // Add all elements in the bottom row
                result.add(matrix[bottom][i]);
            }
            
            // Lift bottom up one notch, so we don't add it twice
            bottom--;
            
            // Moving from bottom left towards top
            for (int i = bottom; i >= top && result.size() < size; i--) {
                result.add(matrix[i][left]);
            }
            
            // Narrow, so we wouldn't add duplicate values
            left++;
            
            
            // End of spiral
        }
        
        return result;
        
    }
}
