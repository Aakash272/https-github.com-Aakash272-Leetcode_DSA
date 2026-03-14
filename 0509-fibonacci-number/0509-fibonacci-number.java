class Solution {
    int dp[];
    public int helper(int i){
    if(i<=1) return i;

    if(dp[i]!=-1) return dp[i];
    int take=helper(i-1)+helper(i-2);
    return dp[i]=take;
    }
    public int fib(int n) {
        if(n<=1) return n;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n);
    }
}