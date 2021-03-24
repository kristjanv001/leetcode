class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {     
        if (matrix.length == 0) {
            return new int[]{};
        }
        
        // Set up HashMap and result array
        Map<Integer, List<Integer>> map = new HashMap<>();
        int[] result = new int[matrix.length * matrix[0].length];
        
        // Loop over the entire matrix: i is rows and j is columns
        for (int i = 0; i < matrix.length; i++) {       
            for (int j = 0; j < matrix[0].length; j++) {
                
                // If a mapping for the key is not present, add and element to a list.
                // We end up with something like this: 
                // {0=[1], 1=[2,4], 2=[3,5,7], 3=[6,8], 4=[9]}
                map.computeIfAbsent(i + j, k -> new ArrayList<>()).add(matrix[i][j]);
            }
        }
        
        // Once we have the the entries in the map, we now have to reverse some of them and 
        // then add them to the result array.
        int idx = 0;
        
        // Loop over every entry in the map (entry is the key-value pair)
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {  
            
            // If the key (i+j) cleanly divides by 2, then reverse the values in the list.
            // So, e.g. [3,5,7] becomes [7,5,3].
            // We do this to get the 'snake'-like structure.
            if (entry.getKey() % 2 == 0) {      
                Collections.reverse(entry.getValue());
            }
            
            // We get all the values in the list and add them to the result array.
            for (int value : map.get(entry.getKey())) {
                result[idx++] = value;
            }

        }
        return result;
    }
}
