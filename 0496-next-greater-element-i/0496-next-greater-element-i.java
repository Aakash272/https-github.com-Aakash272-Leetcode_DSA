class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            int a=nums1[i];
            int b=-1;
            boolean res=false;
            boolean ans=false;
            for(int j=0;j<nums2.length;j++){
                         if(nums2[j]==a){
                            ans=true;
                         b=j;
                        }
                if(j>b && a < nums2[j] && ans){
                    result[i]=nums2[j];
                    res=true;
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