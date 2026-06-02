class Solution {
    static int row;
    static int col;
    class Pair{
        int r;
        int c;
        Pair(int r,int c){
            this.r=r;
            this.c=c;
        }
    }
    public void setZeroes(int[][] matrix) {
        row=matrix.length;
        col=matrix[0].length;
        Queue<Pair>q=new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    q.offer(new Pair(i,j));
                }
            }
        }
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int m=curr.r;
            int n=curr.c;
            for(int k=0;k<col;k++){
                matrix[m][k]=0;
            }
            for(int l=0;l<row;l++){
                matrix[l][n]=0;
            }

        }    
    }
}