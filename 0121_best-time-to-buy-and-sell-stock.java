class Solution {
    public int maxProfit(int[] prices) {
        int currentProfit = 0;
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            currentProfit = Math.max(0, currentProfit += prices[i] - prices[i - 1]);
            maxProfit = Math.max(currentProfit, maxProfit);
        }
        return maxProfit;
    }
}



// Old:

// class Solution {
//     public int maxProfit(int[] prices) {
        
//         if (prices.length < 2) {
//             return 0;
//         }      
        
//         int buy = prices[0];      
//         int sell = prices[1];
        
//         int currentProfit = Integer.MIN_VALUE;
//         int globalProfit = sell - buy;
    
        
//         for (int i = 1; i < prices.length; i++) {
//             currentProfit = prices[i] - buy;
            
//             if (currentProfit > globalProfit) {
//                 globalProfit = currentProfit;
//                 sell = prices[i];
//             }
            
//             if (buy > prices[i]) {
//                 buy = prices[i];
//             }
//         }
        
//         if (globalProfit < 1) {
//             return 0;
//         } else {
//             return globalProfit;
//         }
//     }
// }
