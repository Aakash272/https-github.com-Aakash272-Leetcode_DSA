class Solution {
    public int binaryGap(int n) {
       String res=Integer.toBinaryString(n);
   int l=0;
   int r=0;
   int count=0;
   int max=Integer.MIN_VALUE;
   boolean ch=false;
   while(l<res.length() &&  r<res.length()){
    if(res.charAt(r)=='1'){
   count++;
    }
    while(count>1){
        ch=true;
max=Math.max(max,r-l);
l=r;
count=1;
    }
    r++;
   }
   if(!ch){
    return 0;
   }
   return max;
    }
}