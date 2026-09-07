class Solution {
    public int[] runningSum(int[] nums) {
        int presum[] = new int[nums.length];
        int i = 0;
        int sum = 0;
        while(i < nums.length){
            sum+=nums[i];
            presum[i] = sum;
            i++;
        }

        return presum;
    }
}