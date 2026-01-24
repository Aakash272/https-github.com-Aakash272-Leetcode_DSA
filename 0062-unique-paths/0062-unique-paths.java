import java.util.Arrays;

class Solution {
    int[][] dp;  // memoization table

    // Returns number of unique paths from (i,j) to (m-1,n-1)
    public int helper(int i, int j, int m, int n) {
        // Base case: reached bottom-right cell
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // If already computed, return stored result
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int paths = 0;

        // Move down if within bounds
        if (i < m - 1) {
            paths += helper(i + 1, j, m, n);
        }

        // Move right if within bounds
        if (j < n - 1) {
            paths += helper(i, j + 1, m, n);
        }

        dp[i][j] = paths;
        return paths;
    }

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];  // Initialize dp for m rows and n columns
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(0, 0, m, n);
    }
}
