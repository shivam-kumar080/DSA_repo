class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
         StringBuilder temp=new StringBuilder();
        //String temp="";
        for(int i=0;i<n;i++){
            int wt=0;
            
            for(int j=0;j<words[i].length();j++){
                char c=words[i].charAt(j);
                wt +=weights[c-'a']; 
                
            }
            int mod=wt%26;
            char mapped=(char)('z'-mod);
            temp.append(mapped);
        }
        return temp.toString();
        
    }
}