class Solution {
    int dp[][];

    public int helper(int i, int j, String a, String b) {

        if (i < 0) {
            int sum = 0;
            for (int k = 0; k <= j; k++) {
                sum += b.charAt(k);
            }
            return sum;
        }
        if (j < 0) {
            int sum = 0;
            for (int k = 0; k <= i; k++) {
                sum += a.charAt(k);
            }
            return sum;
        }

        if (dp[i][j] != -1) return dp[i][j];

        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] = helper(i - 1, j - 1, a, b);
        }

        int e = a.charAt(i) + helper(i - 1, j, a, b);
        int f = b.charAt(j) + helper(i, j - 1, a, b);

        return dp[i][j] = Math.min(e, f);
    }

    public int minimumDeleteSum(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return helper(n - 1, m - 1, s1, s2);
    }
}