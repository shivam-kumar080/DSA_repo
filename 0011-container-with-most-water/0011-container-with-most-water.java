class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int lp=0;
        int rp=n-1;
        int maxwater=Integer.MIN_VALUE;
        while(lp<rp){
            int Height=Math.min(height[lp],height[rp]);
            int width=Math.abs(lp-rp);
            int currwater=Height*width;
            maxwater=Math.max(maxwater,currwater);
           

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
        
    }
}