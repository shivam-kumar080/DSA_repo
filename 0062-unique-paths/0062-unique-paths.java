class Solution {
    static int m;
    static int n;
    static int dp[][];
    public int uniquePaths(int M, int N) {
        m=M;
        n=N;
        dp=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return solve(0,0);
    }
    public static int solve(int i,int j){
        if(i >= m || j >= n)return 0;
        if(i==m-1 && j==n-1){
            return 1;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        return dp[i][j] =solve(i+1,j) + solve(i,j+1);
    }
}