class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        long result = 0;
        int negCount = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = matrix[i][j];
                int abs = Math.abs(val);
                result += abs;
                minAbs = Math.min(minAbs, abs);
                if (val < 0) {
                    negCount++;
                }
            }
        }
        if (negCount % 2 != 0) {
            result -= 2L * minAbs;
        }

        return result;
    }
}
