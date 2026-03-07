class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0;
        double max = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        max = sum;

        for(int i = 0; i < n - k; i++){
            sum = sum - nums[i] + nums[i + k];
            max = Math.max(max, sum);
        }

        return max / k;
    }
}