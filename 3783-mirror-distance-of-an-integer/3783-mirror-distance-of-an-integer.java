class Solution {
    public int mirrorDistance(int n) {
        int or=n;
        int rem=0;
        while(n!=0){
            int a=n%10;
            rem=rem*10+a;
            n/=10;
        }
        return Math.abs(rem-or);
    }
}