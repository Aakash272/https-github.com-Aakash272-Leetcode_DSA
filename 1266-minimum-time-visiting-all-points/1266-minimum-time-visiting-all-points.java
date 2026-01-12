class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
        int result=0;
        int a=points[0][0];
        int b=points[0][1];
        for(int i=1;i<n;i++){
           int sub1=Math.abs(a-points[i][0]);
           int sub2=Math.abs((b-points[i][1]));
           result+=(Math.max(sub1,sub2));
          a=points[i][0];
          b=points[i][1];
        }
        return result;
    }
}