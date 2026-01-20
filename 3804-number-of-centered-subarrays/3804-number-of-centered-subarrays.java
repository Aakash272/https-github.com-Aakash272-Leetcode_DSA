class Solution {
    public int centeredSubarrays(int[] nums) {
        int n=nums.length;
     int count=0;
     for(int i=0;i<n;i++){
        int sum=0;
        HashSet<Integer> ap=new HashSet<>();
        for(int j=i;j<n;j++){
            sum+=nums[j];
            ap.add(nums[j]);
            if(ap.contains(sum)){
   count++;
            }
        }
     }
return count;
    }
}