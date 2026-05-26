class Solution {
    public int numberOfSpecialChars(String word) {
        int n= word.length();
        int freq_a[]=new int [26];
        int freq_A[]=new int [26];
        int count =0;
        for(char ch: word.toCharArray()){
            if(Character.isLowerCase(ch)){
                freq_a[ch-'a']++;    
            }
            else{    
                freq_A[ch-'A']++;
            }
        }
        for(int i=0;i<26;i++){
            if(freq_a[i]>0 && freq_A[i]>0){
                count++;
            }
        }
        return count++; 
        
    }
}