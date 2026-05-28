class Solution {
    static int m;
    static int n;
    static int dp[][];

    public int uniquePathsWithObstacles(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(0,0,grid);
    }
    public static int solve(int i,int j,int[][] grid){
        if(i >= m || j>= n){        // path is out of bound not possible 
            return 0;
        }
        if( grid[i][j]==1){           // this is the path having obstacle;
            return 0;
        }
        if(i==m-1 &&  j==n-1){          // there is only one row and coloumn
            return 1;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int down = solve(i+1,j,grid);
        int right= solve(i,j+1,grid);

        return dp[i][j]=down + right;
    }
}