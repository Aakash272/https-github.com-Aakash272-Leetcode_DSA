import java.util.*;

class Solution {

    public int helper(int n, int m, int arr[][]){
        int count = 0;

        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 2){

                    if(i-1 >= 0 && arr[i-1][j] == 1){
                        list.add(new int[]{i-1, j});
                    }
                    if(i+1 < n && arr[i+1][j] == 1){
                        list.add(new int[]{i+1, j});
                    }
                    if(j-1 >= 0 && arr[i][j-1] == 1){
                        list.add(new int[]{i, j-1});
                    }
                    if(j+1 < m && arr[i][j+1] == 1){
                        list.add(new int[]{i, j+1});
                    }
                }
            }
        }
        for(int[] x : list){
            arr[x[0]][x[1]] = 2;
        }

        return list.size(); 
    }

    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int time = 0;

        while(true){
            int changed = helper(n, m, grid);

            if(changed == 0) break;

            time++;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1) return -1;
            }
        }

        return time;
    }
}