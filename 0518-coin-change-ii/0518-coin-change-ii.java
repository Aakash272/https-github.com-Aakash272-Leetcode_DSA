class Solution {
    int dp[][];
    public int helper(int i,int n,int amount,int []arr){
        if(i==n){
        if(amount==0) return 1;
        else return 0;
        }
        if(amount==0) return 1;
        if(amount<0 && arr[i]>amount) return Integer.MAX_VALUE;
        if(dp[i][amount]!=-1) return dp[i][amount];
        int skip=helper(i+1,n,amount,arr);
        if(amount-arr[i]<0) return skip;
        int pick=helper(i,n,amount-arr[i],arr);
        return dp[i][amount]=(int)skip+(int)pick;
    }
   
    public int change(int amount, int[] coins) {
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
