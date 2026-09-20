class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for(int i=1;i<=n;i++){
            int r='z'-s.charAt(i-1)+1;
    
           
             sum=sum+(r*i);
        }
        return sum;
    }
}