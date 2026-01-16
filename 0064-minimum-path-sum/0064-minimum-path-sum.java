class Solution {
    int[][] dp;

    public int helper(int r, int c, int[][] grid) {
        int m = grid.length, n = grid[0].length;

        if (r == m - 1 && c == n - 1) return grid[r][c];
        if (dp[r][c] != -1) return dp[r][c];

        int down = Integer.MAX_VALUE, right = Integer.MAX_VALUE;

        if (r + 1 < m) down = helper(r + 1, c, grid);
        if (c + 1 < n) right = helper(r, c + 1, grid);

        return dp[r][c] = grid[r][c] + Math.min(down, right);
    }

    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        dp = new int[m][n];
        for (int[] row : dp) Arrays.fill(row, -1);
        return helper(0, 0, grid);
    }
}
