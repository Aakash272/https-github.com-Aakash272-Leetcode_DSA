import java.util.*;

class Solution {
    long dp[][];

    public long helper(int i, int[] nums, int x, int prevParity) {
        if (i == nums.length) return 0;

        if (dp[i][prevParity] != -1) return dp[i][prevParity];

        long skip = helper(i + 1, nums, x, prevParity);
        long val = nums[i];
        int currParity = nums[i] % 2;

        if (currParity != prevParity) val -= x;

        long pick = val + helper(i + 1, nums, x, currParity);

        return dp[i][prevParity] = Math.max(skip, pick);
    }

    public long maxScore(int[] nums, int x) {
        int n = nums.length;

        dp = new long[n][2];
        for (long[] row : dp) Arrays.fill(row, -1);

        return nums[0] + helper(1, nums, x, nums[0] % 2);
    }
}