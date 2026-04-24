class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int Lmove=0;
        int Rmove=0;
        for(char ch : moves.toCharArray()){
            if(ch=='L' || ch=='_'){
                Lmove -=1;
            }else{
                Lmove +=1;
            }
            if(ch=='R'|| ch=='_'){
                Rmove +=1;
            }else{
                Rmove -=1;
            }
        }
        return Math.max(Math.abs(Lmove),Math.abs(Rmove));
        
    }
}