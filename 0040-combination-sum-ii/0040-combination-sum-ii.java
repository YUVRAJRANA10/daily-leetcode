class Solution {
    public void sum(int index,int sum, int target,int[] candidates,List<Integer> path, List<List<Integer>>ans){

            if (sum == target) {
                ans.add(new ArrayList<>(path));
                return;
            }
       
      for (int i = index; i < candidates.length; i++) {
          
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (sum + candidates[i] > target) {
                break;
            }
       
            path.add(candidates[i]);

            sum(i + 1, sum + candidates[i], target, candidates, path, ans);

            path.remove(path.size() - 1);
        }
        

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        sum(0,0,target,candidates,path,ans);
        return ans;
    }
}