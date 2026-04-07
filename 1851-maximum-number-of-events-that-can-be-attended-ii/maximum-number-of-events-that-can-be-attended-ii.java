class Solution {
    static int dp[][];
    int n;
    public int maxValue(int[][] events, int k) {
        n=events.length;
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        dp=new int [n][k+1];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(events,0,k); 
    }
    public static int solve(int[][] events,int idx,int k){
        if(idx>=events.length || k==0)return 0;
        if(dp[idx][k]!=-1)return dp[idx][k];
        int nt=solve(events,idx+1,k);
        int next=findNext(events, events[idx][1]);;
            int take=events[idx][2]+solve(events,next,k-1);
            return dp[idx][k] = Math.max(take,nt);
    }
    public static int findNext(int events[][],int endDay){
        int l=0;
        int r=events.length;
        while(l<r){
            int mid=(l+r)>>1;
            if(events[mid][0]>endDay){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}