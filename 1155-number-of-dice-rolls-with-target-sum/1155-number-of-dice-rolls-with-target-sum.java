class Solution {
    int dp[][];
    public int helper(int n,int m,int target){
if(n==0) {
    if(target==0) return 1;
    else return 0;
}
if(target<=0) return 0;
if(dp[n][target]!=-1) {
    return dp[n][target];
}
long way=0;
 int mod=1000000007;
for(int i=1;i<=m;i++){
    way=(way+helper(n-1,m,target-i))%mod;
}
return dp[n][target]= (int)way;
    }
    public int numRollsToTarget(int n, int k, int target) {
        dp=new int[n+1][target+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
return helper(n,k,target);
    }
}