class Solution {
  public boolean helper(int n){
    if(n<=1) return false;
   for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0) return false;
    }
return true;
  }
  
    public int minOperations(int[] nums) {
        int n=nums.length;
int result=0;
int ans[]=nums.clone();
       for(int i=0;i<n;i++){
        int val=nums[i];
        if(i%2==0) {
            while(!helper(val)){
                val++;
                result++;
            }
        }
        else{
            while(helper(val)){
                val++;
                result++;
            }
        }
       } 
       return result;
    }
}