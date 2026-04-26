class Solution {
    public List<Integer> findValidElements(int[] nums) {
       List<Integer> ap=new ArrayList<>();
       int n=nums.length;
       if(n==1){
        ap.add(nums[0]);
        return ap;
       }
       else if(n==2){
       ap.add(nums[0]);
       ap.add(nums[1]);
       return ap;

       }
       ap.add(nums[0]);
       int prev[]=new int[n];
       prev[0]=0;
       int j=1;
       for(int i=0;i<n-1;i++){
        prev[j]=Math.max(prev[j-1],nums[i]);
        System.out.println(prev[j]);
        j++;
       } 
       int suf[]=new int[n];
       suf[n-1]=0;
       int k=n-2;
       for(int i=n-1;i>0;i--){
     suf[k]=Math.max(suf[k+1],nums[i]);
     k--;
       }
       for(int i=1;i<n-1;i++){
        if(nums[i]>prev[i] || suf[i]<nums[i]){
            ap.add(nums[i]);
        }
       }
       ap.add(nums[n-1]);
       return ap;
    }
}