class Solution {
    public int minElement(int[] nums) {
        int n= nums.length;
        int y=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x=nums[i];
            int temp=0;
            while(x>0){
                temp += x%10;
                x/=10;
            }
            nums[i]=temp;
            y=Math.min(y,temp);
        }
        return y;
        
    }
}