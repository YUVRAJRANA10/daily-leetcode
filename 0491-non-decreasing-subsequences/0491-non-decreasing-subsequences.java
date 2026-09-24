class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int index, List<Integer> curr, List<List<Integer>> result) {
             if(curr.size() >=2){
                result.add(new ArrayList<>(curr));
             }

             HashSet<Integer> used = new HashSet<>();
             for(int i = index; i < nums.length; i++){
                if(used.contains(nums[i]))continue;

                if(curr.isEmpty() || nums[i] >= curr.get(curr.size() - 1)){
                    used.add(nums[i]);

                    curr.add(nums[i]);

                    backtrack(nums,i+1,curr,result);

                    curr.remove(curr.size() - 1);
                }
             }

        }
    }
