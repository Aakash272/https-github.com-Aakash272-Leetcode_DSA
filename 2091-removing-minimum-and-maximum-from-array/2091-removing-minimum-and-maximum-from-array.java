class Solution {
    public int minimumDeletions(int[] nums) {
        
        int n=nums.length;
        int max_ind=0;
        int min_ind=0;
        int max=nums[0];
        int min=nums[0];
        for(int i=1;i<n;i++){
  if(max< nums[i]){
    max=nums[i];
    max_ind=i;
  }
  if(nums[i]<min){
    min=nums[i];
    min_ind=i;
  }
        }
 
        int mi = Math.min(min_ind, max_ind);
        int ma = Math.max(min_ind, max_ind);

        int r = mi + 1;
        int res = n - ma;

        return Math.min(ma + 1, Math.min(n - mi, r + res));
    }
}