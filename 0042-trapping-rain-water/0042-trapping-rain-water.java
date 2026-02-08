class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int max=height[0];
        for(int i=0;i<n;i++){
       if(max<=height[i]){
        max=height[i];
       }
       left[i]=max;
        }
        int m=height[n-1];
        for(int i=n-1;i>=0;i--){
            if(m<=height[i]){
                m=height[i];
            }
            right[i]=m;
        }
        int count=0;
        for(int i=0;i<n;i++){
            int a=Math.min(left[i],right[i])-height[i];
            if(a>0){
                count+=a;
            }
          
        }
        return count;
    }
}