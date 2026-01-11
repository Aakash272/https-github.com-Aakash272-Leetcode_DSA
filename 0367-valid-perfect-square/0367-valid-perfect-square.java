class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int l=1;
        int h=num;
        while(l<=h){
            int mid=l+(h-l)/2;
            long sq = (long) mid * mid;
            if(sq==num){
                return true;
            }
            else if(sq<num){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
}