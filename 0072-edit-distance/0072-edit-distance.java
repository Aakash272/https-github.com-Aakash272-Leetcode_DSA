class Solution {
    int dp[][];
public int helper(int i,int j,StringBuilder a,StringBuilder b){
    if(i<0) return j+1;
    if(j<0) return i+1;

if(dp[i][j]!=-1) return dp[i][j];
if(a.charAt(i)==b.charAt(j)){
    dp[i][j]=helper(i-1,j-1,a,b);
}
else{
     int del=1+helper(i-1,j,a,b); //delete
    int ins=1+helper(i,j-1,a,b);
    int repl=1+helper(i-1,j-1,a,b); //replace
    dp[i][j]=Math.min(del,Math.min(ins,repl));
}
return dp[i][j];
}
    public int minDistance(String word1, String word2) {
        StringBuilder a=new StringBuilder(word1);
        StringBuilder b=new StringBuilder(word2);
        int n=a.length();
        int m=b.length();
        dp=new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(n-1,m-1,a,b);
    }
}