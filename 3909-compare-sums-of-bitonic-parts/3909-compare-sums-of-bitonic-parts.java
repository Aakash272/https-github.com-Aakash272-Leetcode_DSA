class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;

        int prev = nums[0];
        int ind = -1;
        long sum = prev;

        for (int i = 1; i < n; i++) {
            if (nums[i] > prev) {
                sum += nums[i];
                prev = nums[i];
            } else {
                ind = i;
                break;
            }
        }

        if (ind == -1) return -1;

        long sum2 = nums[ind - 1];

        for (int j = ind; j < n; j++) {
            sum2 += nums[j];
        }

        if (sum == sum2) return -1;
        else if (sum > sum2) return 0;
        else return 1;
    }
}