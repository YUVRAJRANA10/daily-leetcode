import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to set
        for (int num : nums) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : set) {

            // Start only if it's the beginning of a sequence
            if (!set.contains(num - 1)) {

                int current = num;
                int count = 1;

                // Expand forward
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxLen = Math.max(maxLen, count);
            }
        }

        return maxLen;
    }
}