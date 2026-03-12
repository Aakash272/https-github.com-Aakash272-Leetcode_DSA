class Solution {
    int dp[][];
    public int helper(int i,int target,int arr[]){
        if(i==arr.length) {
            if(target==0) return 1;
            else return 0;
        }
        if(target==0) return 1;
        
        if(dp[i][target]!=-1) return dp[i][target];
        int skip=helper(i+1,target,arr);
         int pick = 0;
        if(target - arr[i] >= 0){
            pick = helper(0, target - arr[i], arr);
        }
        return dp[i][target]=skip+pick;

    }
    public int combinationSum4(int[] nums, int target) {
        int n=nums.length;
        dp=new int[n][target+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,target,nums);
    }
}