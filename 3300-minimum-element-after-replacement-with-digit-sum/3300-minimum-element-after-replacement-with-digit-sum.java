class Solution {
    int sum(int a){
        int sum=0;
        while(a!=0){
           int b=a%10;
        sum+=b;
        a/=10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
    
        for(int i=0;i<n;i++){
            int a=nums[i];
            min=Math.min(min,sum(a));

        }
        return min;
    }
}