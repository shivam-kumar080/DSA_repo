class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ws=0;
        int we=0;
        int n=s.length();
        if(s.length()==0){
            return 0;
        }
        HashSet<Character>set=new HashSet<>();
        int maxlen=Integer.MIN_VALUE;
        int len=0;
        while(we<n){
            char ch =s.charAt(we);
            if(set.contains(ch)){
                while(ws<we && set.contains(ch)){
                    set.remove(s.charAt(ws));
                    ws++;
                }
            }
            set.add(ch);
            maxlen=Math.max(maxlen,we-ws+1);
            we++;
        }
        return maxlen;

    }
}