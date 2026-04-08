class Solution {
    public int countKeyChanges(String s) {
        int n=s.length();
        int result=0;
        for(int i=0;i<n-1;i++){
        char c=s.charAt(i);
        char d=s.charAt(i+1);
        int e=Math.abs((int)c-(int)d);
        if(e==32 || e==0){
            continue;
        }
        else{
            result++;
        }
        }
        return result;
    }
}