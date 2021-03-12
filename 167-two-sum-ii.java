class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] indecies = new int[2];
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            if (hashmap.containsKey(target-numbers[i])) {
                indecies[0] = hashmap.get(target-numbers[i])+1;
                indecies[1] = i+1;         
            } else {
                hashmap.put(numbers[i], i);
            }    
        }
        return indecies;
    }
}
