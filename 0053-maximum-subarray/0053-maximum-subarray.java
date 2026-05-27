class Solution {
    public int maxSubArray(int[] nums) {
        // int n= nums.length;
        // int Maxsum=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum += nums[j];
        //         Maxsum = Math.max(Maxsum,sum);
        //     }
        // }
        // return Maxsum;

        int n= nums.length;
        int cs=nums[0];
        int ms=nums[0];
        for(int i=1;i<n;i++){
            cs=Math.max(nums[i],cs+nums[i]);
            ms=Math.max(ms,cs);
        }
        return ms;  
    }
}