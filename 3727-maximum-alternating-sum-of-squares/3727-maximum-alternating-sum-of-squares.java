class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;

     int arr[]=new int[n];
     for(int i=0;i<n;i++){
     arr[i]=Math.abs(nums[i]);
     }
     Arrays.sort(arr);
        int l=0;
        int r=n-1;
        long sum=0;
        while(l<r){
        sum+=(arr[r]*arr[r]);
        sum-=(arr[l]*arr[l]);
        r--;
        l++;
        }
   
        if(n%2!=0){
            return sum+(arr[n/2]*arr[n/2]);
        }
        return sum;
    }
}