class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
            int freq=map.get(ch);
            map.put(ch,freq+1);
            }
            else{
                map.put(ch,1);
            }  
        }
         TreeSet<Character> set = new TreeSet<>((a, b) -> {
            int freqCompare = map.get(b) - map.get(a); 
            if(freqCompare == 0) {
                return a - b; 
            }
            return freqCompare;
        });

        set.addAll(map.keySet());

        List<Character>list=new ArrayList<>();
        for(char ch:set){
            int num=map.get(ch);
            while(num>0){
                list.add(ch);
                num--;
            }
        }
        StringBuilder sb= new StringBuilder();
        
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }
        return sb.toString();
        
    }
}