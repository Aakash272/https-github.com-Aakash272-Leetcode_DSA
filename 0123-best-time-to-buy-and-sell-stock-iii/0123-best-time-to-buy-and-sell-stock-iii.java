class Solution {
    int helper(int arr[],int i,int buy,int dp[][][],int cap){
     if(cap==0){
            return 0;
        } 
if(i==arr.length){
    return 0;
}
  
if(dp[i][buy][cap]!=-1){
    return dp[i][buy][cap];
}
if(buy==0){
    int take=-arr[i]+helper(arr,i+1,1,dp,cap);
    int nottake=helper(arr,i+1,0,dp,cap);
   
   return dp[i][buy][cap]=Math.max(take,nottake);
}
else{
     int take=arr[i]+helper(arr,i+1,0,dp,cap-1);
    int nottake=helper(arr,i+1,1,dp,cap);
  return  dp[i][buy][cap]=Math.max(take,nottake); 
}

}
    public int maxProfit(int[] prices) {
            int n=prices.length;
    int dp[][][]=new int[n][2][3];
     for (int i = 0; i < n; i++) {
            for (int buy = 0; buy < 2; buy++) {
                Arrays.fill(dp[i][buy], -1);
            }
        }
return helper(prices,0,0,dp,2);
    
    }
}