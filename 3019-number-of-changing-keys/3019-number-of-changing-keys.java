class Solution {
    public int countKeyChanges(String s) {
        int count = 0;
        // Convert the string to lowercase once to make comparisons easier
        String lowerS = s.toLowerCase();
        
        for (int i = 0; i < lowerS.length() - 1; i++) {
            // Compare characters using primitive equality
            if (lowerS.charAt(i) != lowerS.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }
}