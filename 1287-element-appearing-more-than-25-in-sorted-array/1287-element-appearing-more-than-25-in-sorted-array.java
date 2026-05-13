class Solution {
    public int findSpecialInteger(int[] nums) {
        int n =nums.length;
        int res=0;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int num :nums){
            if(mp.containsKey(num)){
                int freq=mp.get(num);
                mp.put(num,freq+1);
            }else{
                mp.put(num,1);
            }
        }
        for(int num : mp.keySet()){
            if(mp.get(num)  > n/4 ){
                res=num;
                
            }
        }
        return res;   
    }
}