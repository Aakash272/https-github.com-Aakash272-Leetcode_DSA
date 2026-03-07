class Solution {
    int dp[][];
    public int helper(int i,int j,StringBuilder a,StringBuilder b){
        if(i<0 || j<0) return 0;

if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)){
            dp[i][j]=1+helper(i-1,j-1,a,b);
        }
        else{
            dp[i][j]=Math.max(helper(i,j-1,a,b),helper(i-1,j,a,b));
        }
        return dp[i][j];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder a=new StringBuilder(text1);
        StringBuilder b=new StringBuilder(text2);
        int i=a.length();
        int j=b.length();
        dp=new int[i][j];
        for(int m=0;m<i;m++){
            Arrays.fill(dp[m],-1);
        }
  return helper(i-1,j-1,a,b);
    }
}