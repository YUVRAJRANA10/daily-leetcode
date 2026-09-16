class Solution {

    public void generate(int index, List<Integer> curr, List<List<Integer>> ans, int[] arr) {
        if (index == arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[index]);
        generate(index + 1, curr, ans, arr);
        curr.remove(curr.size() - 1);

        int newindex = index + 1;
        while(newindex < arr.length && arr[newindex] == arr[index]){
            newindex++;
        }
        generate(newindex, curr, ans, arr);

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        generate(0, new ArrayList<>(), ans, nums);
        return ans;
    }
}

// class Solution {

//     public void generate(int index, List<Integer> curr,    HashSet<List<Integer>> ans, int[] arr) {
//         if (index == arr.length) {
//             ans.add(new ArrayList<>(curr));
//             return;
//         }
//         curr.add(arr[index]);
//         generate(index + 1, curr, ans, arr);
//         curr.remove(curr.size() - 1);
//         generate(index + 1, curr, ans, arr);

//     }

//     public List<List<Integer>> subsetsWithDup(int[] nums) {

//         Arrays.sort(nums);
//         HashSet<List<Integer>> set = new HashSet<>();
//         generate(0, new ArrayList<>(), set, nums);

//         return new ArrayList<>(set);
//     }
// }