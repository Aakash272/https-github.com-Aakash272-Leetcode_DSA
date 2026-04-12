class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int result=0;
        int n=nums.length;
        //ASCII value of number 48->57
        for(int i=0;i<n;i++){
            int a=nums[i];
            String res=String.valueOf(a);
            for(int j=0;j<res.length();j++){
             if(res.charAt(j)==(char)(digit+'0')){
                result++;
             }
            }
        }
        return result;
    }
}