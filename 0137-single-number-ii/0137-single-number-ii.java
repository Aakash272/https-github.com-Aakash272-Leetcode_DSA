class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> ap=new HashMap<>();
        for(int i=0;i<n;i++){
            ap.put(nums[i],ap.getOrDefault(nums[i],0)+1);
        }

      for(Map.Entry<Integer,Integer> x:ap.entrySet()){
        if(x.getValue()<3){
            return x.getKey();
        }
      }
      return -1;
    }
}