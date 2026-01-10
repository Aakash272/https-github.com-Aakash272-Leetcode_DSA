class Solution {
    public String largestEven(String s) {
    int n=s.length();
    int count=0;

    StringBuilder sp=new StringBuilder(s);
 for(int i=n-1;i>=0;i--){
        if(s.charAt(i)=='1'){
    sp.deleteCharAt(i);
        }
        else {
            break;
        }
    }
   return sp.toString();
    }
}