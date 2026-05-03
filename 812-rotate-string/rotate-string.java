class Solution {
    public boolean rotateString(String s, String goal) {
    if (s.length() != goal.length()) return false;
        String doubled = s + s;   // concat string to itself
        return doubled.contains(goal);
        
    }
}