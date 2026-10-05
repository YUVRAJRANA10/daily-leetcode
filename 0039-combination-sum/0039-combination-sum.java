import java.util.ArrayList;
import java.util.List;

class Solution {
    private void solve(int index, int[] candidates, int target, int sum, List<Integer> path, List<List<Integer>> ans) {
        // Base case: processed all elements
        if (index == candidates.length) {
            if (sum == target) {
                ans.add(new ArrayList<>(path));
            }
            return;
        }

        // 1. TAKE: stay at 'index' so candidates[index] can be picked again
        if (sum + candidates[index] <= target) {
            path.add(candidates[index]);
            solve(index, candidates, target, sum + candidates[index], path, ans);
            path.remove(path.size() - 1); // Backtrack
        }

        // 2. NOT-TAKE: move to 'index + 1' to never pick candidates[index] again
        solve(index + 1, candidates, target, sum, path, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        solve(0, candidates, target, 0, path, ans);
        return ans;
    }
}