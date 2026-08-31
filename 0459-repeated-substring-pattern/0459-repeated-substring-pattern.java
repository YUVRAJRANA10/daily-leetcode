class Solution {
    public boolean repeatedSubstringPattern(String s) {

        
        int n = s.length();
        int lps[] = new int[n];
        int i = 0;
        int j = 1;

        while (j < n) {

            if (s.charAt(i) == s.charAt(j)) {
                lps[j++] = ++i;
            }
            else if (i > 0) {
                i = lps[i - 1];
            }
            else if (i == 0) {
                j++;
            }
        }
        int len = n - lps[n - 1];
return lps[n - 1] > 0 && n % len == 0;
    }
}