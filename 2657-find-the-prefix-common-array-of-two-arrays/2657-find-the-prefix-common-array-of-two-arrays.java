class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n= A.length;
        int CC=0;
        int freq[]=new int [n+1];
        int ans[]=new int [n];
        for(int i=0;i<n;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2){
                CC++;
            }
            freq[B[i]]++;
            if(freq[B[i]]==2){
                CC++;
            }
            
                ans[i]=CC;
             
        }
        return ans;   
    }
}