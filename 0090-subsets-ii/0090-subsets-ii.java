// class Solution {

//     public void solve(int start, int nums[], List<Integer> path, List<List<Integer>> ans) {
//         ans.add(new ArrayList<>(path));
//         for (int i = start; i < nums.length; i++) {

//             if (i > start && nums[i] == nums[i - 1]) {
//                 continue;
//             }
//             path.add(nums[i]);

//             solve(i + 1, nums, path, ans);

//             path.remove(path.size() - 1);

//         }
//     }

//     public List<List<Integer>> subsetsWithDup(int[] nums) {
//         Arrays.sort(nums);
//         List<List<Integer>> ans = new ArrayList<>();
//         solve(0, nums, new ArrayList<>(), ans);
//         return ans;
//     }
// }


class Solution {

    public void generate(int index, List<Integer> curr,    HashSet<List<Integer>> ans, int[] arr) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[index]);
        generate(index + 1, curr, ans, arr);
        curr.remove(curr.size() - 1);
        generate(index + 1, curr, ans, arr);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        generate(0, new ArrayList<>(), set, nums);

   
        return new ArrayList<>(set);
    }
}