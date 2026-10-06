import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        // Convert list to a Hash Set for O(1) lookups
        Set<String> wordSet = new HashSet<>(wordDict);
        int n = s.length();
        
        // dp[i] means s.substring(0, i) can be segmented into valid dictionary words
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Base case: empty string
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // If the substring up to 'j' is valid AND the remaining part 's[j...i]' is in wordDict
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // Move to the next index once a valid split is found
                }
            }
        }
        
        return dp[n];
    }
}