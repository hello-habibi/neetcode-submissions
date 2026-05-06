class Solution {
    public int maxProfit(int[] prices) {

        int n = prices.length , ans = 0 ;

        int[] buy = new int[n];
        int[] sell = new int[n];


        buy[0]=prices[0];
        // buy date calculaiton 
        for(int i = 1 ;i< n ; i++){
            if(prices[i]<buy[i-1]){
                buy[i] = prices[i];
            }else{
                buy[i] = buy[i-1];
            }
        }

        sell[n-1] = prices[n-1];

        for(int i = n-2; i>=0 ; i--){
            if(prices[i]>sell[i+1]){
                sell[i] = prices[i];
            }else{
                sell[i] = sell[i+1];
            }
        }

        for(int i = 0 ;i<n ; i++){
            if(sell[i]>buy[i]){
                ans = Math.max(ans , (sell[i]-buy[i]));
            }
        }
        return ans;
    }
}
