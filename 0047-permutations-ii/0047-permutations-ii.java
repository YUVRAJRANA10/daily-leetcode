class Solution {

    private void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums,boolean[] visited) {
        if (tempList.size() == nums.length) {
            if(!resultList.contains(tempList)){
            resultList.add(new ArrayList<>(tempList)); }
            return;
        }
        

    for (int i = 0; i < nums.length; i++){

        if(visited[i])continue;
        visited[i] = true;
        tempList.add(nums[i]);
        backtrack(resultList,tempList,nums,visited);
        visited[i] = false;
        tempList.remove(tempList.size()-1);
    }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> resultList = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(resultList, new ArrayList<>(), nums,visited);
        return resultList;
    }
}