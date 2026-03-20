
class Solution {
    int dp[];

    public int helper(int[] nums, int i) {
        if (i >= nums.length - 1) return 0;

        if (dp[i] != -1) return dp[i];

        int minJumps = Integer.MAX_VALUE;

        for (int step = 1; step <= nums[i]; step++) {
            int next = i + step;
            if (next < nums.length) {
                int jumps = helper(nums, next);
                if (jumps != Integer.MAX_VALUE) {
                    minJumps = Math.min(minJumps, 1 + jumps);
                }
            }
        }

        return dp[i] = minJumps;
    }

    public int jump(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp, -1);

        return helper(nums, 0);
    }
}