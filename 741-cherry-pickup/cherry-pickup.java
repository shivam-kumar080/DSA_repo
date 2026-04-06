class Solution {
    static int n;
    static int dp[][][][];
    
    public int cherryPickup(int[][] grid) {
         n=grid.length;
         dp=new int [n+1][n+1][n+1][n+1];
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    Arrays.fill(dp[i][j][k],Integer.MIN_VALUE);
                }
            }
         }
       
          int ans= solve(0,0,0,0,grid);
          return Math.max(0,ans);
    }
    public static int solve(int r1,int c1,int r2,int c2,int grid[][]){
        if(r1>=n || c1>=n || r2>=n || c2>=n ||grid[r1][c1]==-1 || grid[r2][c2]==-1){
            return Integer.MIN_VALUE;

        }
        if(r1 ==n-1 && c1==n-1){
            return grid[r1][c1];
        }
        if(dp[r1][c1][r2][c2]!=Integer.MIN_VALUE)return dp[r1][c1][r2][c2];
        int cherry=0;
        if(r1==r2 && c1==c2){
            cherry += grid[r1][c1];
        }else{
            cherry +=grid[r2][c2]+grid[r1][c1];
        }
        int maxCherry=Math.max(Math.max(solve(r1,c1+1,r2,c2+1,grid),solve(r1+1,c1,r2+1,c2,grid)),Math.max(solve(r1,c1+1,r2+1,c2,grid),solve(r1+1,c1,r2,c2+1,grid)));
        cherry += maxCherry;
       return dp[r1][c1][r2][c2]= cherry;
    }
}