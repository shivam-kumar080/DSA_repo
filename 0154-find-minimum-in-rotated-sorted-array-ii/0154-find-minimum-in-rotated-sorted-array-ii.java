class Solution {
    public int findMin(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int x: nums){
            m = Math.min(m,x);
        }
        return m;
        
    }
}