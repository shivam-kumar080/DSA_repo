class Solution {
    public int reverse(int x) {
       int sign= x<=0 ? -1:1;
       int reversed=0;
        x=Math.abs(x);
       while(x>0){
        int digit=x%10;
        if(reversed>(Integer.MAX_VALUE-digit)/10){
            return 0;
        }
        reversed=reversed*10+digit;
        x=x/10;
       }
       return sign*reversed;
        
    }
}