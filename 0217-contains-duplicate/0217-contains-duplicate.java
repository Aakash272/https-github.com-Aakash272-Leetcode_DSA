class Solution {
    public boolean containsDuplicate(int[] nums) {
      int n=nums.length;
      HashSet<Integer> ap=new HashSet<>();
      for(int i=0;i<n;i++){
        if(ap.contains(nums[i])){
            return true;
        }
        ap.add(nums[i]);
      }
      return false;
    }
}