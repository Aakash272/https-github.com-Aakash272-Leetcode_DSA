class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
        }
        int result=0;
        for(int i=0;i<n;i++){
  result+=Math.abs(max-nums[i]);
        }
        return result;
    }
}