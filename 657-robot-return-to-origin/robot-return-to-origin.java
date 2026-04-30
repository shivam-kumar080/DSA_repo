class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int move_x=0;
        int move_y=0;
        for(char ch : moves.toCharArray()){
            if(ch=='L'){
                move_x -=1;
            }else if (ch=='R'){
                move_x +=1;
            }else if (ch=='U'){
            move_y +=1;
        }else{
            move_y -= 1;
        }
    }
        return move_x ==0 && move_y==0;

        
    }
}