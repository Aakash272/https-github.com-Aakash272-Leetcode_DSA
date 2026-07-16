class Solution {
public int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

public long gcdSum(int[] nums) {
   int n=nums.length;
   int prev[]=new int [n];
   int max=Integer.MIN_VALUE;
   for(int i=0;i<n;i++){
max=Math.max(max,nums[i]);
prev[i]=gcd(nums[i],max);
   }
 Arrays.sort(prev);
 int l=0;
 int r=n-1;
 long sum=0;
 while(l<r){
  sum=sum+(long)gcd(prev[l],prev[r]);
  l++;
  r--;
 }
 return sum;
    }
}