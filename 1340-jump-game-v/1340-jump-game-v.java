class Solution {
    int dp[];
int dfs(int i,int arr[],int d,int n){
    if(dp[i] !=-1) return dp[i];
   int ans = 1;
    for(int j=i+1; j<=Math.min(n-1,i+d); j++){
        if(arr[j] >= arr[i]) break;
        ans = Math.max(ans , 1 + dfs(j,arr,d,n));
    }

    for(int j=i-1; j>=Math.max(0,i-d); j--){
        if(arr[j] >= arr[i]) break;
        ans = Math.max(ans , 1 + dfs(j,arr,d,n));
    }

    return dp[i] = ans;
}
 
    public int maxJumps(int[] arr, int d) {
        int n=arr.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        int res=0;
      for(int i=0;i<n;i++){
    res = Math.max(res , dfs(i,arr,d,n));
}
return res;
    }
}