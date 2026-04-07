import java.util.*;

class Solution {
    static int MOD = 1000000007;
    static int dp[][][];

    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new int[m][n][maxMove + 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return solve(m, n, maxMove, startRow, startColumn);
    }

    public static int solve(int m, int n, int maxMove, int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return 1;
        }

        if (maxMove == 0) {
            return 0;
        }

        if (dp[i][j][maxMove] != -1) return dp[i][j][maxMove];

        long b_paths = 0;

        b_paths = (b_paths + solve(m, n, maxMove - 1, i - 1, j)) % MOD;
        b_paths = (b_paths + solve(m, n, maxMove - 1, i + 1, j)) % MOD;
        b_paths = (b_paths + solve(m, n, maxMove - 1, i, j - 1)) % MOD;
        b_paths = (b_paths + solve(m, n, maxMove - 1, i, j + 1)) % MOD;

        return dp[i][j][maxMove] = (int) b_paths;
    }
}