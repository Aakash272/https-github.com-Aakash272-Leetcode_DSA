class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int  n=nums.length;
    int premax[]=new int[n];
    int suffmin[]=new int[n];
    int max=nums[0];
    int min=nums[n-1];
    for(int i=0;i<n;i++){
        max=Math.max(max,nums[i]);
        premax[i]=max;
    }

    for(int j=n-1;j>=0;j--){
        min=Math.min(min,nums[j]);
        suffmin[j]=min;
    
    }

    for(int i=0;i<n;i++){
        if(premax[i]-suffmin[i] <=k){
            return i;
        }
    }
    return -1;
    }
}