class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> allSubsets = new ArrayList<>();
        
        // Loop from 0 to (2^n) - 1
        for(int i = 0; i < (1 << n); i++) {
            List<Integer> currentSubset = new ArrayList<>();
            
            // Check each bit of 'i' from 0 to n-1
        for(int j = 0 ; j < n; j++){

            if((i & (1 << j)) != 0){
                currentSubset.add(nums[j]);
            }
        }
            
            // Add the constructed subset to our main list
            allSubsets.add(currentSubset);
        }
        
        return allSubsets;
    }
}