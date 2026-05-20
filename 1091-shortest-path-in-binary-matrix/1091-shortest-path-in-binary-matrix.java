class Solution {
    static int dr[]={-1,-1,-1,0,0,1,1,1};
    static int dc[]={-1,0,1,-1,1,-1,0,1};
    static int rowL;
    static int colL;
    public class Pair{
        int row;
        int col;
        int dis;
        Pair(int row,int col,int dis){
            this.row=row;
            this.col=col;
            this.dis=dis;
        }
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        rowL=grid.length;
        colL=grid[0].length;
        boolean vis[][]=new boolean[rowL][colL];
        Queue<Pair>q=new LinkedList<>();
        if(grid[0][0]==1 || grid[rowL-1][colL-1]==1){
            return -1;
        }
        q.offer(new Pair(0,0,1));
        vis[0][0]=true;
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int R=curr.row;
            int C=curr.col;
            int D=curr.dis;
            if(R==rowL-1 && C==colL-1){
                return D;
            }
            for(int i=0;i<8;i++){
                int nR=R+dr[i];
                int nC=C+dc[i];
                if(nR>= rowL || nR<0 || nC>=colL || nC<0 || vis[nR][nC]==true || grid[nR][nC]==1){
                     continue;
                }
                vis[nR][nC]=true;
                q.offer(new Pair(nR,nC,D+1));
            } 
        }
        return -1;
    }
}