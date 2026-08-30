class Solution {
    public int maxProfit(int[] prices) {
        int day=prices[0];
        int profit=0;
        for(int i=0; i<prices.length; i++){
        if(prices[i]<day){
            day=prices[i]; 
        }
        else if(prices[i]-day>profit){
            profit=prices[i]-day;
        }
     }
        return profit;
    }
}