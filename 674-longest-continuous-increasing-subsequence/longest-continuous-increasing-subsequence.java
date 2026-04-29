class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n=nums.length; 
        int maxLen=1;
        for(int i=0;i<n;i++){
            int Len=1;
            for(int j=i;j<n-1;j++){
                if(nums[j]<nums[j+1]){
                    Len++;
            }else{
                break;
            }
        } 
        maxLen=Math.max(maxLen,Len);     
    }
        return maxLen;
        
    }
}