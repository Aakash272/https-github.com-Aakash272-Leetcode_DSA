class Solution {
    public int minPartitions(String n) {
        int m=n.length();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++){
           int a=n.charAt(i)-'0';
           max=Math.max(a,max);
        }
        return max;
    }
}