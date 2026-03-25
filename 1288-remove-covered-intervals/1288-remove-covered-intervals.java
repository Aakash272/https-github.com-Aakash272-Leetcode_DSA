class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n=intervals.length;
       Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        int a=intervals[0][0];
        int b=intervals[0][1];
        int size=n;
        for(int i=1;i<n;i++){
            int c=intervals[i][0];
            int d=intervals[i][1];
            if(c>=a && b>=d){
                size--;
            }
            else{
                a=c;
                b=d;
            }
        }
        return size;
    }
}