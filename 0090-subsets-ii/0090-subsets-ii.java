class Solution {

    public void solve(int start, int nums[], List<Integer> path, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {

            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);

            solve(i + 1, nums, path, ans);

            path.remove(path.size() - 1);

        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), ans);
        return ans;
    }
}