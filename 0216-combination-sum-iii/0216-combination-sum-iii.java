class Solution {
    private void solve(int index, int[] candidates, int target, int sum, List<Integer> path, List<List<Integer>> ans,
            int k) {

        if (path.size() == k) {
            if (sum == target) {
                ans.add(new ArrayList<>(path));
            }
            return;
        }
        if (index == candidates.length || sum > target) {
            return;
        }

        if (sum + candidates[index] <= target) {
            path.add(candidates[index]);
            solve(index+1, candidates, target, sum + candidates[index], path, ans,k);
            path.remove(path.size() - 1);
        }

        solve(index + 1, candidates, target, sum, path, ans,k);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i;
        }
        if (sum > n) {
            return new ArrayList<>();
        }
        int candidates[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        solve(0, candidates, n, 0, path, ans, k);
        return ans;
    }
}