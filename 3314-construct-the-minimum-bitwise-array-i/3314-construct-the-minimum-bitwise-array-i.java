class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
     int n=nums.size();
     int max=0;
     for(int i=0;i<n;i++){
         max=Math.max(nums.get(i),max);
     }
  int result[]=new int[n];
     for(int i=0;i<nums.size();i++){
   int a=nums.get(i);
   boolean res=false;
   for(int j=0;j<max;j++){
  if((j|j+1)==a){
    res=true;
    result[i]=j;
    break;
  }
   }
   if(!res){
    result[i]=-1;
   }
     }  
     return result; 
    }
}