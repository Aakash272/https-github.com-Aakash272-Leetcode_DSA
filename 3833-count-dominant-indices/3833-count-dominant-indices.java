class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
         sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            sum-=nums[i];
      int remaining = n - i - 1;
     double avg = (double) sum / remaining;
        
            if(nums[i]>avg){
                count++;
            }
        }
return count;
    }
}