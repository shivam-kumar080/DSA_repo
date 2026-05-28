class Solution {
    static int n;
    static int dp [];
    //  public int jump(int[] nums) {
    //     int jump =0;
    //     int end=0;
    //     int farthest=0;
    //     for(int i=0;i<nums.length-1;i++){
    //         farthest=Math.max(farthest,i+nums[i]);
    //          if (i == end) {   
    //             jump++;
    //             end = farthest;   
    //         }
    //     }  
    //         return jump;  

    public int jump(int[] nums) {
        n = nums.length;
        dp=new int [n+1];
        Arrays.fill(dp,-1);
        return solve(0, nums);
    }

    public static int solve(int idx, int arr[]) {
        if (idx >= n - 1){
            return 0;
        } 
        if(dp[idx]!=-1)return dp[idx];   
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= arr[idx]; i++) {
            
            int ans=solve(idx+i, arr);
            if(ans!=Integer.MAX_VALUE){
                min=Math.min(min,ans+1);
            }
        }
        return dp[idx]=min;
    }
}