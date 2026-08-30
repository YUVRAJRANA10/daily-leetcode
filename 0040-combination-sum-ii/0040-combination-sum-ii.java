class Solution {

        public void solve(int start, int target,int candidates[], List<Integer> path, List<List<Integer>> ans) {
           
        if (target == 0 ) {
            ans.add(new ArrayList<>(path));
        }

        for (int i = start; i < candidates.length; i++) {
            
            if(i > start && candidates[i] == candidates[i-1] ){
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            path.add(candidates[i]);
             
            solve(i+1,target - candidates[i] ,candidates, path ,ans);
            
            path.remove(path.size() - 1);

        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
                Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,target,candidates, new ArrayList<>(), ans);
        return ans;
    }
}