class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int count=1;
        for(int i=0;i<n-1;i++){
           if(nums[i]==nums[i+1]){
           count++;
           }
        }
        if(count==n) return 0;
        return 1;
    }
}