class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> ap=new HashMap<>();
        ap.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
       sum+=(nums[i]%2);
       if(ap.containsKey(sum-k)){
        count+=ap.get(sum-k);
       }
       ap.put(sum,ap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}