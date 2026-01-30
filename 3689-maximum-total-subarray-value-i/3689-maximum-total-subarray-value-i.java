class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long result=0;
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
      for(int i=0;i<n;i++){
        max=Math.max(nums[i],max);
        min=Math.min(nums[i],min);
      }
     result= (long)max-min;
     return result*(long)k;
    }
}