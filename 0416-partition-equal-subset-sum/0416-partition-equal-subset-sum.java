class Solution {
   static int dp[][];
    public static boolean helper(int i,int j,int []nums,int n){
        if(i==n){
            if(j==0) return true;
            else return false;
        }
        if(dp[i][j]!=-1) return (dp[i][j]==1);
        boolean skip=helper(i+1,j,nums,n);
        boolean ans=false;
        if(j-nums[i]<0) return ans=skip;
        else{
            boolean pick =helper(i+1,j-nums[i],nums,n);
            ans=skip||pick;
        }
        if(ans) dp[i][j]=1;
        else dp[i][j]=0;
        return ans;
    }
    public boolean canPartition(int[] nums) {
  int n=nums.length;
  int sum=0;
  for(int i=0;i<n;i++){
    sum+=nums[i];
  }
  if(sum%2==1) return false;
  int target=sum/2;
dp=new int [n][target+1];
for(int i=0;i<n;i++){
Arrays.fill(dp[i],-1);
}
return helper(0,target,nums,n);
    }
}