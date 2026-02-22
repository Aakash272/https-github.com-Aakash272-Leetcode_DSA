class Solution {
    public int scoreDifference(int[] nums) {
        int n = nums.length;

        int first = 0;
        int second = 0;
        boolean firstActive = true;

        for (int i = 0; i < n; i++) {

            if (nums[i] % 2 == 1) {
                firstActive = !firstActive;
            }
            if (i % 6 == 5) {
                firstActive = !firstActive;
            }
            if (firstActive) {
                first += nums[i];
            } else {
                second += nums[i];
            }
        }

        return first - second;
    }
}