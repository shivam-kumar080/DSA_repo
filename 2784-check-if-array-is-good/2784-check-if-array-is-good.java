class Solution {
    public boolean isGood(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num :nums){
            if(mp.containsKey(num)){
                int freq=mp.get(num);
                mp.put(num,freq+1);
            }else{
                mp.put(num,1);
            }
        }
        for(int i=1;i<=n-2;i++){
            if(!mp.containsKey(i) ||   mp.get(i)!=1){
                return false;
            }
        }
        return (mp.containsKey(n-1) && mp.get(n-1)==2);
        
    }
}