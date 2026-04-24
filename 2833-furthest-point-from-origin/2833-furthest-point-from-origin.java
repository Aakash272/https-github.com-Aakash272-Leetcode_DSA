class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int l=0;
        int r=0;
        int count=0;
        for(int i=0;i<n;i++){
              if(moves.charAt(i)=='L'){
                l++;
              }
              else if(moves.charAt(i)=='R'){
                r++;
              }
              else{
               count++;
              }
        }
int ans=0;
int result=0;
        if(l>=r){
        ans=l+count;
        result=Math.abs(ans-r);
        }
        else if(r>l){
            ans=r+count;
            result=Math.abs(ans-l);
        }
      return result;
    }
}