class Solution {

    public boolean res(String a,char x){

        if(a.charAt(0)==x && a.charAt(a.length()-1)==x){
            return true;
        }
        return false;
    }
    public int countValidSubarrays(int[] nums, int x) {
        int n=nums.length;
        int result=0;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
           sum+=nums[j];
           String b=String.valueOf(sum);
           char c = (char) (x + '0');
    
      if(res(b,c)){
        result++;
      }
            }

        }
        return result;
    }
}