
class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int result[] = new int[2];
        int l = 0;
        int r = 0;

        boolean vis[][] = new boolean[n][m];

        while (l >= 0 && l < n && r >= 0 && r < m) {

            if (vis[l][r]) {
                break;
            }

            vis[l][r] = true;

            result[0] = l;
            result[1] = r;

            if (grid[l][r] == 'R') {
                r++;
            } else if (grid[l][r] == 'L') {
                r--;
            } else if (grid[l][r] == 'U') {
                l--;
            } else if (grid[l][r] == 'D') {
                l++;
            }
        }

        return result;
    }
}
