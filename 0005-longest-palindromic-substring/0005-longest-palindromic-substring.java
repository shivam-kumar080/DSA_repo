class Solution {
    public boolean isPallindrome(String sub) {
        int i = 0;
        int j = sub.length() - 1;
        while (i < j) {
            if (sub.charAt(i) != sub.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n = s.length();
        int maxLen = 0;
        String result = "";
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (isPallindrome(sub) == true) {
                    if (sub.length() > maxLen) {
                        maxLen = sub.length();
                        result = sub;
                    }
                }
            }
        }
        return result;

    }
}