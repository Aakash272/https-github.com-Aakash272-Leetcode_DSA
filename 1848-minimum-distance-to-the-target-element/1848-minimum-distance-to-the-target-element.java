class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int result=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                int c=Math.abs(start-i);
                result=Math.min(c,result);
            }
        }
        return result;
    }
}