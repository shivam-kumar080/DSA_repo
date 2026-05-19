class Solution {
    static int dp[][];
    public int coinChange(int[] coins, int amount) {
        int n= coins.length;
        dp=new int [n][amount+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        int res=solve(n-1,amount,coins); 
        return (res>=(int)1e9)?-1:res;  
    }
    public static int solve(int idx,int amount,int coins[]){
        if(amount ==0)return 0;

        if(idx==0){
            if(amount%coins[idx]==0){ 
            return amount/coins[idx];
            }else{
                return (int)1e9;
            }
        }        
        if(dp[idx][amount]!=-1)return dp[idx][amount];
         int nt=solve(idx-1,amount,coins);
         int take=(int)1e9;
         if(coins[idx]<=amount){
            take=1+solve(idx,amount-coins[idx],coins);
         }
         return dp[idx][amount]=Math.min(take , nt);
    }
}