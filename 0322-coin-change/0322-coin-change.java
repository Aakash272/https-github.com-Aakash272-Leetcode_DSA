class Solution {
    int dp[][];
    public long helper(int i,int n,int amount,int []arr){
        if(i==n) {
            if(amount==0) return 0;
            else  return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!=-1) return dp[i][amount];
        long skip=helper(i+1,n,amount,arr);
        if(amount-arr[i]<0) return skip;
        long pick=1+helper(i,n,amount-arr[i],arr);
        return dp[i][amount]=(int)Math.min(skip,pick);
    }
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        dp=new int[n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
       int res=(int)helper(0,n,amount,coins);
       if(res==Integer.MAX_VALUE) return -1;
       return res;
    }
}