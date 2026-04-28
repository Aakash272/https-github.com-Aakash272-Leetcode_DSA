class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;

        if (n == 1 && m == 1) return 0;

        List<Integer> ap = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ap.add(grid[i][j]);
            }
        }

        // Sort to find median
        Collections.sort(ap);

        int target = ap.get(ap.size() / 2);
        int result = 0;

        for (int i = 0; i < ap.size(); i++) {
            int a = ap.get(i);

            if (Math.abs(a - target) % x != 0) {
                return -1;
            }

            result += Math.abs(a - target) / x;
        }

        return result;
    }
}