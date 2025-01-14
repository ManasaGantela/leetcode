class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min_profit=prices[0];
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-min_profit;
            max_profit=Math.max(max_profit,cost);
            min_profit=Math.min(min_profit,prices[i]);

        }
        return max_profit;
        
    }
}