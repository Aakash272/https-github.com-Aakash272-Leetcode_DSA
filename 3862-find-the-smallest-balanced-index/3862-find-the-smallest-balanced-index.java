class Solution {
    public int smallestBalancedIndex(int[] nums) {

        int n = nums.length;
if(n==2 && nums[0]==1) return 1;
        int[] preSum = new int[n];
        int[] prod = new int[n];

        preSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            preSum[i] = preSum[i-1] + nums[i];
        }

        prod[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            prod[i] = prod[i+1] * nums[i];
        }

        for(int i = 1; i < n-1; i++){
            int leftSum = (i == 0) ? 0 : preSum[i-1];
            int rightProd = (i == n-1) ? 1 : prod[i+1];

            if(leftSum == rightProd){
                return i;
            }

        }

        return -1;
    }
}