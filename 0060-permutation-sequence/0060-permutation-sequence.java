class Solution {

    public String getPermutation(int n, int k) {

        List<Integer> nums = new ArrayList<>();

        // Calculate (n-1)!
        int fact = 1;

        for (int i = 1; i < n; i++) {
            fact = fact * i;
        }

        // Store numbers 1 to n
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        // Convert k from 1-based to 0-based
        k--;

        StringBuilder ans = new StringBuilder();

        while (true) {

            // Find which block k belongs to
            int index = k / fact;

            // Choose that number
            ans.append(nums.get(index));

            // Remove chosen number
            nums.remove(index);

            // If no numbers remain, we're done
            if (nums.size() == 0) {
                break;
            }

            // Find k inside the selected block
            k = k % fact;

            // Calculate factorial for next level
            fact = fact / nums.size();
        }

        return ans.toString();
    }
}