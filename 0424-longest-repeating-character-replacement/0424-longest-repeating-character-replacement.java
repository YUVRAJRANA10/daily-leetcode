class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // Frequency map
        int l = 0;
        int r = 0;
        int maxfreq = 0;
        int maxLength = 0;

        while (r < s.length()) {
            // 1. Add the new character to the window's frequency count
            count[s.charAt(r) - 'A']++;
            
            // 2. Update maxfreq (No loop required!)
            maxfreq = Math.max(maxfreq, count[s.charAt(r) - 'A']);
            
            // 3. If the window is invalid, shrink it from the left
            if ((r - l + 1) - maxfreq > k) {
                count[s.charAt(l) - 'A']--;
                l++; // Slide the left pointer
            }
            
            // 4. The window is now guaranteed to be valid, update maxLength
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        
        return maxLength;
    }
}