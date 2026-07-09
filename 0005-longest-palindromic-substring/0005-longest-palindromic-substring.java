class Solution {

public String longestPalindrome(String s) {
    if (s == null || s.length() == 0) return "";
    
    int max = 0;
    String finalstring = "";
    
    for (int i = 0; i < s.length(); i++) {
        StringBuilder n = new StringBuilder();
        for (int j = i; j < s.length(); j++) {
            n.append(s.charAt(j));
            
            // Check if the current substring 'n' is a palindrome
            if (isPalindrome(n.toString())) {
                // Compare the length of the SUBSTRING 'n', not 's'
                if (n.length() > max) {
                    max = n.length();
                    finalstring = n.toString();
                }
            }
        }
    }
    return finalstring;
}

public boolean isPalindrome(String a) {
    int l = 0; 
    int r = a.length() - 1; 
    while (l < r) {
        if (a.charAt(l) != a.charAt(r)) {
            return false; 
        } 
        l++; 
        r--; 
    } 
    return true; 
}
}