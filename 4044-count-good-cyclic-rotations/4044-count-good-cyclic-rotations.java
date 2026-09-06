class Solution {
    public int countGoodRotations(int[] nums) {
        
        int n=nums.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n/2;i++){
          sum1+=nums[i];
        }
        for(int j=n/2;j<n;j++){
            sum2+=nums[j];
        }
        int count=0;
        for(int i=0;i<n;i++){
             if(sum1 > sum2){
              count++;
            }
            sum1=(sum1-nums[i])+nums[(i+n/2)%n];
            sum2=(sum2-nums[(i+n/2)%n])+nums[i];
        System.out.println(sum1);
        System.out.println(sum2);
                 
        }

        if(sum1==sum2 && count==0) return 0;
        return count;
    }
}