class Solution {
    static int INF = (int)1e9;
    static int dp[][][];
    public int minCost(int[] houses, int[][] cost, int m, int n, int target) {
        dp=new int [m][n+1][target+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<=n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }

        int ans = solve(0, 0, 0, houses, cost, m, n, target);//   (idx ,prevcolors,neigh)
        return ans >= INF ? -1 : ans;
    }

    public static  int solve(int idx, int prevColor, int neigh,
                    int[] houses, int[][] cost,
                    int m, int n, int target) {

        if (neigh > target) return INF;

        if (idx == m) {
            return neigh == target ? 0 : INF;
        }
        if(dp[idx][prevColor][neigh]!=-1)return dp[idx][prevColor][neigh];


        int res = INF;

        if (houses[idx] != 0) {
            int color = houses[idx];
            int newNeigh = neigh;
            if (color != prevColor) newNeigh++;

            res = solve(idx + 1, color, newNeigh,
                      houses, cost, m, n, target);
        } else {
            for (int color = 1; color <= n; color++) {
                int newNeigh = neigh;
                if (color != prevColor) newNeigh++;

                int curr = cost[idx][color - 1] +
                           solve(idx + 1, color, newNeigh,
                               houses, cost, m, n, target);

                res = Math.min(res, curr);
            }
        }

        return dp[idx][prevColor][neigh]=res;
    }
}