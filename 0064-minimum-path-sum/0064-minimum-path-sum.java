class Solution {
    static int m;
    static int n;
    static int dp[][];
    public int minPathSum(int[][] grid) {
        m= grid.length;
        n= grid[0].length;
        dp=new int [m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0, grid); 
    }
    public static int solve(int i,int j,int grid[][]){
        if(i >= m || j >= n)return Integer.MAX_VALUE;
        if(i==m-1 && j==n-1){
            return grid[i][j];
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int right=solve(i,j+1,grid);
        int down=solve(i+1,j,grid);

        return dp[i][j]=grid[i][j]+Math.min(right,down );
    }
}