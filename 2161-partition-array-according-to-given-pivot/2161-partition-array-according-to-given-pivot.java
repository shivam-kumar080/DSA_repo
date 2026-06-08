class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        List<Integer>l3=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i]<pivot){
                l1.add(nums[i]);
            }else if (nums[i]==pivot){
                l2.add(nums[i]);
            }else{
                l3.add(nums[i]);
            }
        }
        int i=0;
        for(int num:l1){
            nums[i++]=num;
        }
        for(int num:l2){
            nums[i++]=num;
        }
        for(int num:l3){
            nums[i++]=num;
        }
        return nums;   
    }
}