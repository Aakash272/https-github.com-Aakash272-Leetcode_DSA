class Solution {
    int max=Integer.MIN_VALUE;
    int dp[];
    public int helper(int arr[],int i,int n){
        if(i>=n){
            // max=Math.max(max,count);
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int took=arr[i]+helper(arr,i+2,n);
        int nottook=0+helper(arr,i+1,n);
 return dp[i]=Math.max(took,nottook);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int i=0;
        dp=new int[n];
        Arrays.fill(dp,-1);
      return  helper(nums,i,n);
    }
}