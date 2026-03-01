class Solution {
    int dp[][];
    public int helper(int [][] arr,int i,int j){
        if(arr[0][0]==-1 || arr[arr.length-1][arr[0].length-1]==-1){
            return 0;
        }
        if(i==arr.length-1 && j==arr[0].length-1){
            return 1;
        }
        if(i>=arr.length || j>=arr[0].length || arr[i][j]==-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int row=helper(arr,i+1,j);
        int col=helper(arr,i,j+1);
        return dp[i][j]=row+col;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n=obstacleGrid.length;
        int m=obstacleGrid[0].length;
            dp=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(obstacleGrid[i][j]==1){
                      obstacleGrid[i][j]=-1; 
                    }
                }
            }
            for(int i=0;i<n;i++){
                Arrays.fill(dp[i],-1);
            }
return helper(obstacleGrid,0,0);
    }
}