class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n= nums.length;
        int idx=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                idx=Math.min(idx,Math.abs(i-start));
            }
        }
        return idx;
        
    }
}