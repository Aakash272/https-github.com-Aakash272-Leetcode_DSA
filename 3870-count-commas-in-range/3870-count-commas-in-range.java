class Solution {
    public int countCommas(int n) {
    String s=String.valueOf(n);
    if(s.length()<=3) return 0;
//     int res=Integer.parseInt(s.substring(1));
//    return res+1; 
     return n-1000+1;
    }
}