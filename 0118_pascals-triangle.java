class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows == 0) {
            return triangle;
        }
        
        // Create the first list of number 1 and add it to the triangle
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        
        // At each iteration we add a new list in
        for (int i = 1; i < numRows; i++){

            // Add new rows based on previous rows
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();
            
            // Here we start populating the rows.
            currRow.add(1); // First row element is always 1

            // We get the middle of the row based on the previous row
            for (int j = 1; j < i; j++) {
                currRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
    
            currRow.add(1); // Last row element is always 1
          
            // Add the constructed row to the triangle
            triangle.add(currRow);
        }
        
        return triangle;
    }
}
