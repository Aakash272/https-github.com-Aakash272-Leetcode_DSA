class Solution {
    public long maxSum(int[] nums, int k, int mul) {
       int n=nums.length;
       Arrays.sort(nums);
      
       List<Integer> ap=new ArrayList<>();
       for(int i=n-1;i>=n-k;i--){
        ap.add(nums[i]);
       } 
     long sum=0;
       for(int i=0;i<ap.size();i++){
        if(mul==0){
        sum+=(long)ap.get(i);
        }
        else{
            sum=sum+(long)ap.get(i)*mul;
        mul--;
        }
       }
       return sum;
    }
}