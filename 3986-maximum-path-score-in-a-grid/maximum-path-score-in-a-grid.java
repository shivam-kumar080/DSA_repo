class Solution {
   static  int m;
   static  int n;
   static int dp[][][];
    public int maxPathScore(int[][] grid, int k) {
        m=grid.length;
        n=grid[0].length;
        dp=new int [m+1][n+1][k+1];
         for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int c = 0; c <= k; c++) {
                    dp[i][j][c] = -1;
                }
            }
        }
        int ans= solve(grid,k,0,0,0); 
        return ans==Integer.MIN_VALUE?-1:ans;
    }
    public  int solve(int [][]grid,int k,int i,int j,int cost){
        if(i>=m || j>=n){
            return Integer.MIN_VALUE;
        }
        if(dp[i][j][cost]!=-1)return dp[i][j][cost];
        int newcost = cost + (grid[i][j]>0?1:0);
        if(newcost>k){
            return Integer.MIN_VALUE;
        }
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        int right=solve(grid,k,i,j+1,newcost);
        int down=solve(grid,k,i+1,j,newcost);

        if(right==Integer.MIN_VALUE && down==Integer.MIN_VALUE) 
        return dp[i][j][cost]=Integer.MIN_VALUE;

        return dp[i][j][cost]= grid[i][j] + Math.max(right,down) ;

    }
}