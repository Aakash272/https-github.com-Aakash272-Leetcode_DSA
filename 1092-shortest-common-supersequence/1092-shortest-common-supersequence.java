import java.util.*;

class Solution {
    int dp[][];

    public int helper(String str1, String str2, int i, int j){
        if(i >= str1.length() || j >= str2.length()) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        if(str1.charAt(i) == str2.charAt(j)){
            return dp[i][j] = 1 + helper(str1, str2, i+1, j+1);
        }

        return dp[i][j] = Math.max(
            helper(str1, str2, i+1, j),
            helper(str1, str2, i, j+1)
        );
    }

    public String shortestCommonSupersequence(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        dp = new int[n][m];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        helper(str1, str2, 0, 0);

        StringBuilder res = new StringBuilder();

        int i = 0, j = 0;
while(i < n && j < m){
    if(str1.charAt(i) == str2.charAt(j)){
        res.append(str1.charAt(i));
        i++;
        j++;
    }
    else {
        int down = (i + 1 < n) ? dp[i+1][j] : 0;
        int right = (j + 1 < m) ? dp[i][j+1] : 0;

        if(down >= right){
            res.append(str1.charAt(i));
            i++;
        } else {
            res.append(str2.charAt(j));
            j++;
        }
    }
}
        while(i < n){
            res.append(str1.charAt(i++));
        }

        while(j < m){
            res.append(str2.charAt(j++));
        }

        return res.toString();
    }
}