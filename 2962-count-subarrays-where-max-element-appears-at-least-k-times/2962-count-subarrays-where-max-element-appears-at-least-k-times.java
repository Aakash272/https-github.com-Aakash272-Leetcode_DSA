class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
        }

        long result = 0;
        int left = 0;
        int count = 0;
        for (int right = 0; right < n; right++) {

            if (nums[right] == max) {
                count++;
            }
            while (count >= k) {
                result += (n - right);
                if (nums[left] == max) {
                    count--;
                }
                left++;
            }
        }

        return result;
    }
}
