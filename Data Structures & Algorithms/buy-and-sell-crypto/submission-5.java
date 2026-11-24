class Solution {
    public int maxProfit(int[] prices) {
     int l=0;
     int r=1;
     int profit=0;
     while(r<prices.length){
        if(prices[l]>prices[r]){
            l=r;
            r++;
        }else{
        int maxi=prices[r]-prices[l];
        profit=Math.max(maxi,profit);
        r++;

        }
        

     } 
        

        return profit;
        
    }
}
