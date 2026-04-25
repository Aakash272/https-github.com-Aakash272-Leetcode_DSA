class Solution {
    public boolean validDigit(int n, int x) {
        
        String res=String.valueOf(n);
        int count=0;
        for(int i=1;i<res.length();i++){

            if(res.charAt(i)-'0'==x){
                count++;
                
            }
        }if(count>0 && res.charAt(0)-'0'!=x) return true;
        return false;
    }
}