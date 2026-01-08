class Solution {
    public int getSum(int c, int d) {
       while(d!=0){
        int carry=c&d;
        c=c^d;
        d=carry<<1;
      }
      return c;
    }
}