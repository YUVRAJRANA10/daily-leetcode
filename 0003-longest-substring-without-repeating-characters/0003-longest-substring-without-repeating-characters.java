class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        // Hash array -> stores last seen index of characters
        int[] hash = new int[256];

        // Initialize all values with -1 (not seen)
        for (int i = 0; i < 256; i++) {
            hash[i] = -1;
        }

        int l = 0;          // Left pointer
        int r = 0;          // Right pointer
        int maxLen = 0;     // Stores answer

        // Expand window while right pointer is valid
        while (r < s.length()) {

            char ch = s.charAt(r);

            // If character seen before AND inside window
            if (hash[ch] != -1 && hash[ch] >= l) {
                
                // Move left pointer just after duplicate
                l = hash[ch] + 1;
            }

            // Calculate current window length
            int len = r - l + 1;

            // Update maximum length
            maxLen = Math.max(maxLen, len);

            // Update last seen index of character
            hash[ch] = r;

            // Move right pointer forward
            r++;
        }

        return maxLen;
    }
}
