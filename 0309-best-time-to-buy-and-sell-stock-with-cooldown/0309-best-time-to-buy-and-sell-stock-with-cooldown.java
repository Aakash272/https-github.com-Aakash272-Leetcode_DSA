import java.util.Arrays;
class Solution {
int dp[][];
public int helper(int i,int buy,int arr[]){
    if(i>=arr.length) return 0;
    if(dp[i][buy]!=-1) return dp[i][buy];
    if(buy==1){
        int take=-arr[i]+helper(i+1,0,arr);
        int skip=helper(i+1,1,arr);
        dp[i][buy]=Math.max(take,skip);
    }
    else{
        int take=arr[i]+helper(i+2,1,arr);
        int skip=helper(i+1,0,arr);
        dp[i][buy]=Math.max(take,skip);
    }
return dp[i][buy];
}
    public int maxProfit(int[] prices) {
 int n=prices.length;
 dp=new int[n][2];
 for(int i=0;i<n;i++){
    Arrays.fill(dp[i],-1);
 }
 return helper(0,1,prices);
    }
}