class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n= nums2.length;
        int m=nums1.length;
        
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!list.contains(nums2[i]) && nums2[i]==nums1[j]){
                    list.add(nums2[i]);
                }
            }
        }
        int arr[]=new int [list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
        
    }
}