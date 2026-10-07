class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int x: nums){
          sum+=x;
        }
        int rest = sum%k;
        if(rest == 0){
            return 0;
        }
        return rest;
    }
}