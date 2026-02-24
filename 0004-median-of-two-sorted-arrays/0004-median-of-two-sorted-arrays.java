class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
         if(n > m){
            return findMedianSortedArrays(nums2,nums1);
         }
         int l=0;
         int h=n;
         int left=(n+m+1)/2;
         while(l<=h){
            int mid1=l+(h-l)/2;
            int mid2=left-mid1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;
            if(0 <= mid1-1) l1=nums1[mid1-1];
            if(0 <= mid2-1) l2=nums2[mid2-1];
            if(n > mid1) r1=nums1[mid1];
            if(m > mid2) r2=nums2[mid2];

            if(l1<=r2 && l2<=r1){
                if((n + m) % 2 == 1) return (double)Math.max(l1,l2);
                return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2;
            }
            else if(l1>r2){
                h=mid1-1;
            }
            else{
                l=mid1+1;
            }
         }
         return 0;
    }
}