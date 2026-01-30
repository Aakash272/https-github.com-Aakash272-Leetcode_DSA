class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
    int n=nums.length;
    int result=0;
    boolean rse=false;
    for(int i=0;i<n;i++){
        if(nums[i]%2==0){
            rse=true;
   result= result | nums[i] ;
        }
    }
    if(!rse){
        return 0;
    }
    return result;
    }
}